package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Formula 1", 1); // Arbitrary values for wheels, doors, gears, seats
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        // Determine gear based on speed
        if (newSpeed == 0) {
            changeGear(1); // Stop the car, set gear as 1
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            move(newSpeed, getCurrentDirection());
        }
    }
}
