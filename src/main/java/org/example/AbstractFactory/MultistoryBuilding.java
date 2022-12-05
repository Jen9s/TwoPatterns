package org.example.AbstractFactory;

import org.example.AbstractFactory.Roof.MetalRoof;
import org.example.AbstractFactory.Roof.Roof;
import org.example.AbstractFactory.Roof.SlateRoof;
import org.example.AbstractFactory.Wall.BlockWall;
import org.example.AbstractFactory.Wall.BrickWall;
import org.example.AbstractFactory.Wall.Wall;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MultistoryBuilding implements Building{
    public MultistoryBuilding(){
    }
    public MultistoryBuilding(int FloorNumber){
        this.FloorNumber = FloorNumber;
    }
    private Roof roof = null;
    private Wall wall = null;
    private int FloorNumber = 1;
    @Override
    public void BuildingConstruction() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("You want metal roof or not? (y/n)");
        String answer;
        answer = in.next();
        if(Objects.equals(answer, "y")){
            roof = new MetalRoof();
        } else {
            roof = new SlateRoof();
        }
        System.out.println("You want brick wall or not? (y/n)");
        answer = in.next();
        if(Objects.equals(answer, "y")){
            wall = new BrickWall();
        } else {
            wall = new BlockWall();
        }
        System.out.print("Loading");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.print(".");
        sleep(1000);
        System.out.println();
        System.out.println("   /" + roof.Get() + "\\   ");
        System.out.println("  /" + roof.Get() + roof.Get() + roof.Get() + "\\ ");
        System.out.println(" /" + roof.Get() + roof.Get() + roof.Get() + roof.Get() + roof.Get() + "\\ ");
        System.out.println("/-------\\");

        for(int i = 0; i < FloorNumber - 1;i++){
            System.out.println("|"+ wall.Get() + wall.Get() + wall.Get() + wall.Get() + wall.Get() + wall.Get() + wall.Get() + "|");
            System.out.println("|"+ wall.Get() + "  " + wall.Get() + wall.Get() + " " + wall.Get() + "|_|");
            System.out.println("|"+ wall.Get() + wall.Get() + wall.Get() + wall.Get() + wall.Get() + wall.Get() + wall.Get() + "|");
        }

        System.out.println("|"+ wall.Get() + wall.Get() + "_" + wall.Get() + wall.Get() + wall.Get() + wall.Get() + "|");
        System.out.println("|"+ wall.Get() + "| |" + wall.Get() + " " + wall.Get() + "|");
        System.out.println("|"+ wall.Get() + "| |" + wall.Get() + wall.Get() + wall.Get() + "|");
        System.out.println("#########");
    }
}
