package com.company.model;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop(){
        System.out.println("Vehicle.stop()");
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        System.out.println("Vehicle.steer()");
        this.currentDirection += direction;
    }

    public void move(int direction, int velocity) {
        System.out.println("Vehicle.move()");
        this.currentVelocity = velocity;
        this.currentDirection = direction;
    }
}
