package com.example.kylemiller.myapplication;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 05/10/2017.
 */
public class AirplaneTest {
    Airplane airplane;

    @Before
    public void setup(){
         airplane = new Airplane(2, 3 ,"bob", 10);
    }

    @Test
    public void testCalculatethingy(){
        assertEquals(airplane.calculateFlightSpeedWithPassengers(), 3);
    }

}