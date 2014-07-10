package com.maradine.nova;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Star {

    //starting mineral concentrations of intrinsic planet
    private final Float startingMineralOneConcentration;
    private final Float startingMineralTwoConcentration;
    private final Float startingMineralThreeConcentration;

    //current mineral concentrations of intrinsic planet
    private Float mineralOneConcentration;
    private Float mineralTwoConcentration;
    private Float mineralThreeConcentration;

    //surface minerals on on intrinsic planet
    private Float mineralOneSurface;
    private Float mineralTwoSurface;
    private Float mineralThreeSurface;

    public Star(Float mineralThreeConcentration, Float startingMineralOneConcentration, Float startingMineralTwoConcentration, Float startingMineralThreeConcentration, Float mineralOneConcentration, Float mineralTwoConcentration) {
        this.startingMineralOneConcentration = startingMineralOneConcentration;
        this.startingMineralTwoConcentration = startingMineralTwoConcentration;
        this.startingMineralThreeConcentration = startingMineralThreeConcentration;
        this.mineralOneConcentration = mineralOneConcentration;
        this.mineralTwoConcentration = mineralTwoConcentration;
        this.mineralThreeConcentration = mineralThreeConcentration;
        this.mineralOneSurface = 0f;
        this.mineralTwoSurface = 0f;
        this.mineralThreeSurface = 0f;
    }

    public Star(Float mineralThreeSurface, Float startingMineralOneConcentration, Float startingMineralTwoConcentration, Float startingMineralThreeConcentration, Float mineralOneConcentration, Float mineralTwoConcentration, Float mineralThreeConcentration, Float mineralOneSurface, Float mineralTwoSurface) {
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

    public Float getStartingMineralOneConcentration() {
        return startingMineralOneConcentration;
    }

    public Float getStartingMineralTwoConcentration() {
        return startingMineralTwoConcentration;
    }

    public Float getStartingMineralThreeConcentration() {
        return startingMineralThreeConcentration;
    }

    public Float getMineralOneConcentration() {
        return mineralOneConcentration;
    }

    public void setMineralOneConcentration(Float mineralOneConcentration) {
        this.mineralOneConcentration = mineralOneConcentration;
    }

    public Float getMineralTwoConcentration() {
        return mineralTwoConcentration;
    }

    public void setMineralTwoConcentration(Float mineralTwoConcentration) {
        this.mineralTwoConcentration = mineralTwoConcentration;
    }

    public Float getMineralThreeConcentration() {
        return mineralThreeConcentration;
    }

    public void setMineralThreeConcentration(Float mineralThreeConcentration) {
        this.mineralThreeConcentration = mineralThreeConcentration;
    }

    public Float getMineralOneSurface() {
        return mineralOneSurface;
    }

    public void setMineralOneSurface(Float mineralOneSurface) {
        this.mineralOneSurface = mineralOneSurface;
    }

    public Float getMineralTwoSurface() {
        return mineralTwoSurface;
    }

    public void setMineralTwoSurface(Float mineralTwoSurface) {
        this.mineralTwoSurface = mineralTwoSurface;
    }

    public Float getMineralThreeSurface() {
        return mineralThreeSurface;
    }

    public void setMineralThreeSurface(Float mineralThreeSurface) {
        this.mineralThreeSurface = mineralThreeSurface;
    }
}
