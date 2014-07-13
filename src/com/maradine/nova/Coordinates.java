package com.maradine.nova;

/**
 * Created by maradine on 7/13/14.
 */
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceFrom(Coordinates other) {
        int ox = other.getX();
        int diffx = x-ox;
        int a2 = diffx*diffx;

        int oy = other.getY();
        int diffy = y-oy;
        int b2 = diffy*diffy;

        int c2 = a2+b2;
        return Math.sqrt(c2);
    }


}
