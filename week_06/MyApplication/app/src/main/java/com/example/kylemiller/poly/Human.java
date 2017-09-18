package com.example.kylemiller.poly;

/**
 * Created by kylemiller on 18/09/2017.
 */

public class Human implements Walkable {
    private String name;
    private int hairFollicles;
    private int numberOfFingers;

    public Human(String name, int hairFollicles, int numberOfFingers) {
        this.name = name;
        this.hairFollicles = hairFollicles;
        this.numberOfFingers = numberOfFingers;
    }

    public String getName() {
        return name;
    }

    public int getHairFollicles() {
        return hairFollicles;
    }

    public int getNumberOfFingers() {
        return numberOfFingers;
    }

    public String walk(){
        return "wowee look at me, walking... with no hands!";
    }
    
}
