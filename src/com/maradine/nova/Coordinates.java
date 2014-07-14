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

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Coordinates)) {
            return false;
        } else if (o == this) {
            return true;
        }
        Coordinates oc = (Coordinates) o;
        if (oc.getX() == this.getX() && oc.getY() == this.getY()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 37 * x;
        hash = hash * 19 * y;
        return hash;
    }

}
