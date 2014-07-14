package com.maradine.nova;

public class Main {

    public static void main(String[] args) {
	    System.out.println("HELLO SHITLORDS");

        Universe uni = new Universe(500,500);

        for (int i=0; i<10; i++) {
            uni.addStar(Star.getRandomDebugStar());
        }

        for (int i=0; i<10; i++) {
            uni.addFleet(Fleet.getRandomDebugFleet());
        }

        uni.dumpUniverse();

        /* distance calculation tester
        for (Star s : uni.getStars().values()){
            Coordinates sc = s.getCoordinates();
            for (Star o : uni.getStars().values()) {
                Coordinates oc = o.getCoordinates();
                System.out.println(s.getName()+" IS "+sc.distanceFrom(oc)+" FROM "+o.getName());
            }
        } */

    }

}
