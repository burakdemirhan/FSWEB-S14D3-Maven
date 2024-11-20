package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name ) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }
    public String  accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake(){
        printSimpleName();
        return "the car is braking";
    }
    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }
    private void printSimpleName(){
        System.out.println("Class Name: " + getClass().getSimpleName());
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders +
                ", engine=" + engine + ", wheels=" + wheels + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        Car car = (Car) obj;
   return cylinders == car.cylinders && Objects.equals(name, car.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }


}
