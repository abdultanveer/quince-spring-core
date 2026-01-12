package org.example;

public class Car {

    private Engine engine;

    // Constructor Injection (BEST PRACTICE)
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}