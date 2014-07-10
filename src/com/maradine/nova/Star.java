package com.maradine.nova;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Star {

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

    public Star(double startingMineralOneConcentration, double startingMineralTwoConcentration, double startingMineralThreeConcentration, double mineralOneConcentration, double mineralTwoConcentration, double mineralThreeConcentration, double mineralOneSurface, double mineralTwoSurface, double mineralThreeSurface) {
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

    public Star(double startingMineralOneConcentration, double startingMineralTwoConcentration, double startingMineralThreeConcentration, double mineralOneConcentration, double mineralTwoConcentration, double mineralThreeConcentration) {
        this.startingMineralOneConcentration = startingMineralOneConcentration;
        this.startingMineralTwoConcentration = startingMineralTwoConcentration;
        this.startingMineralThreeConcentration = startingMineralThreeConcentration;
        this.mineralOneConcentration = mineralOneConcentration;
        this.mineralTwoConcentration = mineralTwoConcentration;
        this.mineralThreeConcentration = mineralThreeConcentration;
        mineralOneSurface = 0;
        mineralTwoSurface = 0;
        mineralThreeSurface = 0;
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
}
