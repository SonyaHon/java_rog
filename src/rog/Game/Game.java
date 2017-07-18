package rog.Game;

import com.sun.javafx.geom.Vec2d;
import com.sun.javafx.scene.traversal.Direction;
import rog.Entitys.FixedCreatures.Player;
import rog.Maps.GlobalMap;
import rog.Maps.LocalMapData;
import rog.Screen.DisplayManager;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game {

    private DisplayManager displayManager;
    private GlobalMap globalMap;

    private LocalMapData currentLocalMap;

    private Player player;


    public Game(DisplayManager displayManager) {
        this.displayManager = displayManager;

        globalMap = new GlobalMap(displayManager.getScreenWidth(), displayManager.getScreenHeight());
        currentLocalMap = globalMap.getStartingLocation();

        // Creating player here.
        player = new Player("you", new Vec2d(10, 10), new Glyph('@', new Color(255, 255, 0)));
        currentLocalMap.placePlayer(player);

        // Handle player controls here
        displayManager.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if(player.getY() > 0)
                            player.move(Direction.UP);
                        else
                            changeMap(currentLocalMap.getX(), currentLocalMap.getY() - 1);
                        break;
                    case KeyEvent.VK_DOWN:
                        if(player.getY() < displayManager.getScreenHeight() - 1)
                            player.move(Direction.DOWN);
                        else
                            changeMap(currentLocalMap.getX(), currentLocalMap.getY() + 1);
                        break;
                    case KeyEvent.VK_LEFT:
                        if(player.getX() > 0)
                            player.move(Direction.LEFT);
                        else
                            changeMap(currentLocalMap.getX() - 1, currentLocalMap.getY());
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(player.getX() < displayManager.getScreenWidth() - 1)
                            player.move(Direction.RIGHT);
                        else
                            changeMap(currentLocalMap.getX() + 1, currentLocalMap.getY());
                        break;
                }
                mainLoop();
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }

    public void mainLoop(){
        displayManager.drawMap(currentLocalMap);
        displayManager.refresh();
    }

    public void changeMap(int newX, int newY) {
       /* globalMap.saveData(currentLocalMap.getX(), currentLocalMap.getY(), currentLocalMap);
        currentLocalMap = globalMap.getLocalAt(newX, newY);
        currentLocalMap.placePlayer(player);
        */
    }
}
