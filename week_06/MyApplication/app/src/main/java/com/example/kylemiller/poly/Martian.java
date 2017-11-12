package com.example.kylemiller.poly;

/**
 * Created by kylemiller on 18/09/2017.
 */

public class Martian implements Walkable {
    private String name;
    private int age;

    public Martian(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String walk(){
        return "wow look at me, walking with 10 legs";
    }
}
