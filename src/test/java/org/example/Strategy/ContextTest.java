package org.example.Strategy;

import org.junit.jupiter.api.Assertions;


class ContextTest {

    @org.junit.jupiter.api.Test
    void littleOneGetFloorNumber() {
        Context context = new Context(-1);
        Assertions.assertEquals(1,context.getFloorNumber());
    }

    @org.junit.jupiter.api.Test
    void OneGetFloorNumber() {
        Context context = new Context(1);
        Assertions.assertEquals(1,context.getFloorNumber());
    }

    @org.junit.jupiter.api.Test
    void MoreOneGetFloorNumber() {
        Context context = new Context(3);
        Assertions.assertEquals(3,context.getFloorNumber());
    }

    @org.junit.jupiter.api.Test
    void littleOneSetFloorNumber() {
        Context context = new Context(2);
        context.setFloorNumber(-1);
        Assertions.assertEquals(1,context.getFloorNumber());
    }

    @org.junit.jupiter.api.Test
    void OneSetFloorNumber() {
        Context context = new Context(3);
        context.setFloorNumber(1);
        Assertions.assertEquals(1,context.getFloorNumber());
    }

    @org.junit.jupiter.api.Test
    void MoreOneSetFloorNumber() {
        Context context = new Context(7);
        context.setFloorNumber(5);
        Assertions.assertEquals(5,context.getFloorNumber());
    }
}