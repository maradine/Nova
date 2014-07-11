package com.maradine.nova;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Player {

    private final int id;
    private final String name;
    private final int owner;

    public Player(int id, String name, int owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOwner() {
        return owner;
    }

}
