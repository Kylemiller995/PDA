package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 18/09/2017.
 */

public class FlyingVehicle {
    public int flightSpeed;
    public int passengerAmount;
    private String manufacturer;

    public FlyingVehicle(int flightSpeed, int passengerAmount, String manufacturer) {
        this.flightSpeed = flightSpeed;
        this.passengerAmount = passengerAmount;
        this.manufacturer = manufacturer;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}

