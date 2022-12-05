package org.example.AbstractFactory.Roof;

public class MetalRoof implements Roof{
    private String material;

    public MetalRoof() {
        material = "^";
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
