package com.maradine.nova;

import java.util.Random;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Star {

    private final int id;

    //coordinates in space
    private double xCoord;
    private double yCoord;

    private String name;

    //starting mineral concentrations of intrinsic planet
    private final double startingMineralOneConcentration;
    private final double startingMineralTwoConcentration;
    private final double startingMineralThreeConcentration;

    //current mineral concentrations of intrinsic planet
    private double mineralOneConcentration;
    private double mineralTwoConcentration;
    private double mineralThreeConcentration;

    //surface minerals on on intrinsic planet
    private double mineralOneSurface;
    private double mineralTwoSurface;
    private double mineralThreeSurface;

    public Star(int id, double xCoord, double yCoord, String name, double startingMineralOneConcentration, double startingMineralTwoConcentration, double startingMineralThreeConcentration, double mineralOneConcentration, double mineralTwoConcentration, double mineralThreeConcentration, double mineralOneSurface, double mineralTwoSurface, double mineralThreeSurface) {
        this.id = id;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
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

    public Star(int id, double xCoord, double yCoord, String name, double startingMineralOneConcentration, double startingMineralTwoConcentration, double startingMineralThreeConcentration) {
        this.id = id;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
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

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStartingMineralOneConcentration() {
        return startingMineralOneConcentration;
    }

    public double getStartingMineralTwoConcentration() {
        return startingMineralTwoConcentration;
    }

    public double getStartingMineralThreeConcentration() {
        return startingMineralThreeConcentration;
    }

    public double getMineralOneConcentration() {
        return mineralOneConcentration;
    }

    public void setMineralOneConcentration(double mineralOneConcentration) {
        this.mineralOneConcentration = mineralOneConcentration;
    }

    public double getMineralTwoConcentration() {
        return mineralTwoConcentration;
    }

    public void setMineralTwoConcentration(double mineralTwoConcentration) {
        this.mineralTwoConcentration = mineralTwoConcentration;
    }

    public double getMineralThreeConcentration() {
        return mineralThreeConcentration;
    }

    public void setMineralThreeConcentration(double mineralThreeConcentration) {
        this.mineralThreeConcentration = mineralThreeConcentration;
    }

    public double getMineralOneSurface() {
        return mineralOneSurface;
    }

    public void setMineralOneSurface(double mineralOneSurface) {
        this.mineralOneSurface = mineralOneSurface;
    }

    public double getMineralTwoSurface() {
        return mineralTwoSurface;
    }

    public void setMineralTwoSurface(double mineralTwoSurface) {
        this.mineralTwoSurface = mineralTwoSurface;
    }

    public double getMineralThreeSurface() {
        return mineralThreeSurface;
    }

    public void setMineralThreeSurface(double mineralThreeSurface) {
        this.mineralThreeSurface = mineralThreeSurface;
    }

    public static Star getRandomDebugStar() {
        Random rand = new Random();
        int id = rand.nextInt();
        double x = rand.nextDouble()*1000;
        double y = rand.nextDouble()*1000;
        String n = "BLAH";
        double m1sc = rand.nextDouble()*1000;
        double m2sc = rand.nextDouble()*1000;
        double m3sc = rand.nextDouble()*1000;

        Star s = new Star(id,x,y,n,m1sc,m2sc,m3sc);
        return s;

    }

    public void dumpStar() {
        System.out.println("==DUMPING STAR TO CONSOLE==");
        System.out.println("COORDINATES: x:"+xCoord+" y:"+yCoord);
        System.out.println("NAME: "+name);
        System.out.println("MINERAL 1: "+startingMineralOneConcentration+" SC " +mineralOneConcentration+" MC "+mineralOneSurface+ "SM");
        System.out.println("MINERAL 2: "+startingMineralTwoConcentration+" SC " +mineralTwoConcentration+" MC "+mineralTwoSurface+ "SM");
        System.out.println("MINERAL 3: "+startingMineralThreeConcentration+" SC " +mineralThreeConcentration+" MC "+mineralThreeSurface+ "SM");
    }

}
