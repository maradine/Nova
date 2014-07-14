package com.maradine.nova;

import java.awt.Point;

/**
 * Created by maradine on 7/11/14.
 */
public class FleetDestination {
    private Point location;
    private int speed;

    public FleetDestination(Point location, int speed) {
        this.location = location;
        this.speed = speed;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
