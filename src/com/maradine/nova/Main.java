package com.maradine.nova;

import com.thoughtworks.xstream.XStream;

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

        XStream xstream = new XStream();

        System.out.println(xstream.toXML(uni));

    }

}
