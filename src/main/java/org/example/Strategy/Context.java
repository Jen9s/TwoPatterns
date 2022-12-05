package org.example.Strategy;

import java.util.Scanner;

public class Context {
    private int FloorNumber = 0;
    private BuildingConstruction buildingConstruction;
    public Context(){
        System.out.println("How many floors do you want in the building?");
        Scanner in = new Scanner(System.in);
         FloorNumber = in.nextInt();
        if(FloorNumber < 1){
            System.out.println("We can't build this building that's why we build a one-story house.");
            FloorNumber = 1;
        }
    }

    public Context(int floorNumber){
        this.FloorNumber = floorNumber;
        if(FloorNumber < 1){
            System.out.println("We can't build this building that's why we build a one-story house.");
            FloorNumber = 1;
        }
    }

    public void setFloorNumber(int floorNumber){
        this.FloorNumber = floorNumber;
        if(FloorNumber < 1){
            System.out.println("We can't build this building that's why we build a one-story house.");
            FloorNumber = 1;
        }
    }

    public int getFloorNumber(){
        return FloorNumber;
    }

    public void build() throws InterruptedException {
        if(FloorNumber == 1)
            buildingConstruction = new OneFloor();
        else
            buildingConstruction = new MoreOneFloor(FloorNumber);
    }
}
