package org.example.Strategy;

import org.example.AbstractFactory.Building;
import org.example.AbstractFactory.MultistoryBuilding;

public class MoreOneFloor implements BuildingConstruction{
    private Building building;
    public MoreOneFloor(int floors) throws InterruptedException {
        building = new MultistoryBuilding(floors);
        building.BuildingConstruction();
    }
}
