package org.example.AbstractFactory.Wall;

public class BlockWall implements Wall{
    private String material;

    public BlockWall(){
        material = "%";
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
