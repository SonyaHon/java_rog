package rog.Game;

import rog.Maps.GlobalMap;
import rog.Maps.LocalMapData;
import rog.Screen.DisplayManager;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game {

    private DisplayManager displayManager;
    private GlobalMap globalMap;

    private LocalMapData currentLocalMap;


    public Game(DisplayManager displayManager) {
        this.displayManager = displayManager;

        globalMap = new GlobalMap(displayManager.getScreenWidth(), displayManager.getScreenHeight());
        currentLocalMap = globalMap.getStartingLocation();

        // Handle player controls here
        displayManager.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

    public void mainLoop(){
        displayManager.drawMap(currentLocalMap);
        displayManager.refresh();
    }

    public void changeMap(int newX, int newY) {
        globalMap.saveData(currentLocalMap.getX(), currentLocalMap.getY(), currentLocalMap);
        currentLocalMap = globalMap.getLocalAt(newX, newY);
    }
}
