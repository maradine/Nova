package com.maradine.nova;

/**
 * Created by maradine on 7/11/14.
 */
public class FleetTuple {

    public FleetDestination dest;
    public FleetOrder order;

    public FleetTuple(FleetDestination dest, FleetOrder order) {
        this.dest = dest;
        this.order = order;
    }
}
