package org.example.AbstractFactory.Roof;

public class SlateRoof implements Roof {
    private String material;

    public SlateRoof() {
        material = "~";
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