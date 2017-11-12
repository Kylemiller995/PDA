package com.example.kylemiller.myapplication;

/**
 * Created by kylemiller on 18/09/2017.
 */

public class Airplane extends FlyingVehicle {

    int amountOfWings;


    public Airplane(int flightSpeed, int passengerAmount, String manufacturer, int amountOfWings) {
        super(flightSpeed, passengerAmount, manufacturer);
        this.amountOfWings = amountOfWings;
    }

    public int calculateFlightSpeedWithPassengers() {
        int flightspeed = this.flightSpeed / this.getPassengerAmount();
        return flightspeed;
    }

}



