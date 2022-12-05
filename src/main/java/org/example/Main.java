package org.example;

import org.example.Strategy.Context;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();
        context.build();
        context.setFloorNumber(1);
        context.build();
    }
}