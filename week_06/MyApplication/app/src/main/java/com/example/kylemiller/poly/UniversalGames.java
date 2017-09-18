package com.example.kylemiller.poly;

import java.util.ArrayList;

/**
 * Created by kylemiller on 18/09/2017.
 */

public class UniversalGames {

    private ArrayList<Walkable> walkers;

    public UniversalGames(ArrayList<Walkable> walkers) {
        this.walkers = walkers;
    }

    public ArrayList<Walkable> getWalkers() {
        return walkers;
    }

    public void addWalkers(Walkable thing){
        walkers.add(thing);
    }
}
