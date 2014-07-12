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
    private double xCoord;
    private double yCoord;

    //orders
    private FleetOrder zeroOrder;
    private LinkedList<FleetTuple> orders;

    public Fleet(int id, String name, int owner, double xCoord, double yCoord) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zeroOrder = null;
        this.orders = new LinkedList<FleetTuple>();
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

    public FleetOrder getZeroOrder() {
        return zeroOrder;
    }

    public void setZeroOrder(FleetOrder zeroOrder) {
        this.zeroOrder = zeroOrder;
    }

    public LinkedList<FleetTuple> getOrders() {
        return orders;
    }

    public void setOrders(LinkedList<FleetTuple> orders) {
        this.orders = orders;
    }
}
