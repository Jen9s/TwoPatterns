package org.example.AbstractFactory.Wall;

public class BrickWall implements Wall{
    private String material;

    public BrickWall(){
        material = "+";
    }

    @Override
    public String Get() {
        return material;
    }

    @Override
    public void Set(String material) {
        this.material = material;
    }
}
