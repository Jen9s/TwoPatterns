package org.example.AbstractFactory;

import org.example.AbstractFactory.*;
import org.example.AbstractFactory.Roof.Roof;
import org.example.AbstractFactory.Wall.Wall;

public interface Building {
    Roof roof = null;
    Wall wall = null;
    int FloorNumber = 0;
    void BuildingConstruction() throws InterruptedException;
}
