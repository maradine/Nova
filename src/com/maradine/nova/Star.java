package com.maradine.nova;

import java.util.Random;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Star {

    private final int id;

    //coordinates in space
    private Coordinates location;

    private String name;

    //starting mineral concentrations of intrinsic planet
    private final int startingMineralOneConcentration;
    private final int startingMineralTwoConcentration;
    private final int startingMineralThreeConcentration;

    //current mineral concentrations of intrinsic planet
    private int mineralOneConcentration;
    private int mineralTwoConcentration;
    private int mineralThreeConcentration;

    //surface minerals on on intrinsic planet
    private int mineralOneSurface;
    private int mineralTwoSurface;
    private int mineralThreeSurface;

    public Star(int id, Coordinates location, String name, int startingMineralOneConcentration, int startingMineralTwoConcentration, int startingMineralThreeConcentration, int mineralOneConcentration, int mineralTwoConcentration, int mineralThreeConcentration, int mineralOneSurface, int mineralTwoSurface, int mineralThreeSurface) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.startingMineralOneConcentration = startingMineralOneConcentration;
        this.startingMineralTwoConcentration = startingMineralTwoConcentration;
        this.startingMineralThreeConcentration = startingMineralThreeConcentration;
        this.mineralOneConcentration = mineralOneConcentration;
        this.mineralTwoConcentration = mineralTwoConcentration;
        this.mineralThreeConcentration = mineralThreeConcentration;
        this.mineralOneSurface = mineralOneSurface;
        this.mineralTwoSurface = mineralTwoSurface;
        this.mineralThreeSurface = mineralThreeSurface;
    }

    public Star(int id, Coordinates location, String name, int startingMineralOneConcentration, int startingMineralTwoConcentration, int startingMineralThreeConcentration) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.startingMineralOneConcentration = startingMineralOneConcentration;
        this.startingMineralTwoConcentration = startingMineralTwoConcentration;
        this.startingMineralThreeConcentration = startingMineralThreeConcentration;
        this.mineralOneConcentration = startingMineralOneConcentration;
        this.mineralTwoConcentration = startingMineralTwoConcentration;
        this.mineralThreeConcentration = startingMineralThreeConcentration;
        this.mineralOneSurface=0;
        this.mineralTwoSurface=0;
        this.mineralThreeSurface=0;
    }

    public int getId() {
        return id;
    }

    public Coordinates getCoordinates() {
        return location;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartingMineralOneConcentration() {
        return startingMineralOneConcentration;
    }

    public int getStartingMineralTwoConcentration() {
        return startingMineralTwoConcentration;
    }

    public int getStartingMineralThreeConcentration() {
        return startingMineralThreeConcentration;
    }

    public int getMineralOneConcentration() {
        return mineralOneConcentration;
    }

    public void setMineralOneConcentration(int mineralOneConcentration) {
        this.mineralOneConcentration = mineralOneConcentration;
    }

    public int getMineralTwoConcentration() {
        return mineralTwoConcentration;
    }

    public void setMineralTwoConcentration(int mineralTwoConcentration) {
        this.mineralTwoConcentration = mineralTwoConcentration;
    }

    public int getMineralThreeConcentration() {
        return mineralThreeConcentration;
    }

    public void setMineralThreeConcentration(int mineralThreeConcentration) {
        this.mineralThreeConcentration = mineralThreeConcentration;
    }

    public int getMineralOneSurface() {
        return mineralOneSurface;
    }

    public void setMineralOneSurface(int mineralOneSurface) {
        this.mineralOneSurface = mineralOneSurface;
    }

    public int getMineralTwoSurface() {
        return mineralTwoSurface;
    }

    public void setMineralTwoSurface(int mineralTwoSurface) {
        this.mineralTwoSurface = mineralTwoSurface;
    }

    public int getMineralThreeSurface() {
        return mineralThreeSurface;
    }

    public void setMineralThreeSurface(int mineralThreeSurface) {
        this.mineralThreeSurface = mineralThreeSurface;
    }

    public static Star getRandomDebugStar() {
        Random rand = new Random();
        int id = rand.nextInt();
        int x = rand.nextInt(1000);
        int y = rand.nextInt(1000);
        Coordinates loc = new Coordinates(x,y);
        String n = "BLAH";
        int m1sc = rand.nextInt(1000);
        int m2sc = rand.nextInt(1000);
        int m3sc = rand.nextInt(1000);

        Star s = new Star(id,loc,n,m1sc,m2sc,m3sc);
        return s;

    }

    public void dumpStar() {
        System.out.println("\t==DUMPING STAR TO CONSOLE==");
        System.out.println("\tID: "+id+" NAME: "+name);
        System.out.println("\tCOORDINATES: x:"+ location.getX()+" y:"+ location.getY());
        System.out.println("\tMINERAL 1: "+startingMineralOneConcentration+" SC " +mineralOneConcentration+" MC "+mineralOneSurface+ " SM");
        System.out.println("\tMINERAL 2: "+startingMineralTwoConcentration+" SC " +mineralTwoConcentration+" MC "+mineralTwoSurface+ " SM");
        System.out.println("\tMINERAL 3: "+startingMineralThreeConcentration+" SC " +mineralThreeConcentration+" MC "+mineralThreeSurface+ " SM");
    }

}
