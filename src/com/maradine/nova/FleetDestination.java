package com.maradine.nova;

/**
 * Created by maradine on 7/11/14.
 */
public class FleetDestination {
    private Coordinates location;
    private int speed;

    public FleetDestination(Coordinates location, int speed) {
        this.location = location;
        this.speed = speed;
    }

    public Coordinates getLocation() {
        return location;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
