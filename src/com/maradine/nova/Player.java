package com.maradine.nova;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Player {

    private final int id;
    private final String name;


    public Player(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
