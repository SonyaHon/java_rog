package rog;

import rog.Game.Game;
import rog.Screen.DisplayManager;

public class Main {

    public static void main(String[] args) {
        // Display manager handles all window stuff
        Game game = new Game(new DisplayManager());

        game.mainLoop();
    }

}
