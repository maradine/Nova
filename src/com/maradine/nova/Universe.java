package com.maradine.nova;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Universe {

    //collection of players
    private final HashMap<Integer, Player> players;

    //collection of fleets
    private final HashMap<Integer, Fleet> fleets;

    //collection of stars
    private final HashMap<Integer, Star> stars;

    //how big is the universe (standard euclidian coords, origin bottom left)
    private final int xSize;
    private final int ySize;


    public Universe(int xSize, int ySize) {
        this.xSize = xSize;
        this.ySize = ySize;
        players = new HashMap<Integer, Player>();
        fleets = new HashMap<Integer, Fleet>();
        stars = new LinkedHashMap<Integer, Star>();
    }

    public HashMap<Integer, Player> getPlayers() {
        return players;
    }

    public HashMap<Integer, Fleet> getFleets() {
        return fleets;
    }

    public HashMap<Integer, Star> getStars() {
        return stars;
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public void addStar(Star s) {
        stars.put(s.getId(),s);
    }

    public void addFleet(Fleet f) {fleets.put(f.getId(),f);}

    public void dumpUniverse() {
        System.out.println("==DUMPING UNIVERSE TO CONSOLE==");
        System.out.println("UNIVERSE IS "+xSize+" BY "+ySize);
        int numPlayers = players.size();
        System.out.println("UNIVERSE HAS " + numPlayers + " PLAYERS");
        int numFleets = fleets.size();
        System.out.println("UNIVERSE HAS " + numFleets + " FLEETS");
        int numStars = stars.size();
        System.out.println("UNIVERSE HAS " + numStars + " STARS");

        for (int i : stars.keySet()){
            stars.get(i).dumpStar();
        }

        for (int i : fleets.keySet()){
            fleets.get(i).dumpFleet();
        }
    }
}
