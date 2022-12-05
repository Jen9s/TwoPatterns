package org.example.Strategy;

import org.example.AbstractFactory.Building;
import org.example.AbstractFactory.OneStoryBuilding;

public class OneFloor implements BuildingConstruction{
    private Building building;
    OneFloor() throws InterruptedException {
        building = new OneStoryBuilding();
        building.BuildingConstruction();
    }
}
