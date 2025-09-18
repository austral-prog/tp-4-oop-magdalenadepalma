package com.elevator;

public class Elevator {
    private int minFloor;
    private int maxFloor;
    private int maxCapacity;
    private int newFloor;
    private int currentCapacity;


    public Elevator(int minFloor, int maxFloor, int maxCapacity) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxCapacity = maxCapacity;
    }

    public void moveToFloor(int floor) {
        // Move elevator to the floor if it is within the minFloor and maxFloor
        if ((floor >= minFloor) && (floor <= maxFloor)){
            this.newFloor = floor;
        } else {
            this.newFloor = newFloor;
        }
    }

    public void addPassenger(){
        // Add a passenger to the elevator if the elevator is not full
        if (currentCapacity < maxCapacity) {
            this.currentCapacity = currentCapacity + 1;
        }
    }

    public void removePassenger(){
        // Remove a passenger from the elevator if the elevator is not empty
        if (currentCapacity > 0) {
            this.currentCapacity = currentCapacity - 1;
        }
    }

    public int getCurrentFloor(){
        // Return the current floor of the elevator
        return newFloor;
    }

    public int getPassengerCount(){
        // Return the number of passengers in the elevator
        return currentCapacity;
    }



}
