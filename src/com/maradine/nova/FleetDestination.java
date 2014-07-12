package com.maradine.nova;

/**
 * Created by maradine on 7/11/14.
 */
public class FleetDestination {
    private double xCoord;
    private double yCoord;
    private int speed;

    public FleetDestination(double xCoord, double yCoord, int speed) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.speed = speed;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
