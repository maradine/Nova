package com.maradine.nova;

import java.util.LinkedList;

/**
 * Created by cdeibler on 7/10/14.
 */
public class Fleet {

    //book keeping
    private final int id;
    private String name;
    private final int owner;

    //position in space
    private Coordinates location;

    //orders
    private FleetOrder zeroOrder;
    private LinkedList<FleetOrderTuple> orders;

    public Fleet(int id, String name, int owner, Coordinates location) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.location = location;
        this.zeroOrder = null;
        this.orders = new LinkedList<FleetOrderTuple>();
    }

    public int getId() {
        return id;
    }

    public int getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FleetOrder getZeroOrder() {
        return zeroOrder;
    }

    public void setZeroOrder(FleetOrder zeroOrder) {
        this.zeroOrder = zeroOrder;
    }

    public LinkedList<FleetOrderTuple> getOrders() {
        return orders;
    }

    public void setOrders(LinkedList<FleetOrderTuple> orders) {
        this.orders = orders;
    }

    public Coordinates getCoordinates() {
        return location;
    }

    public void setLoc(Coordinates location) {
        this.location = location;
    }
}
