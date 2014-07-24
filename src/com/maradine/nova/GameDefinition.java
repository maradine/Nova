package com.maradine.nova;

import java.util.Map;

/**
 * Created by cdeibler on 7/24/14.
 */
public class GameDefinition {

    //collection of players
    private final Map<Integer, Player> players;

    private final Universe universe;

    public GameDefinition(Map<Integer, Player> players, Universe universe) {
        this.players = players;
        this.universe = universe;
    }

}
