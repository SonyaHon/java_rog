package rog.Maps;

import com.sun.javafx.geom.Vec2d;

public class GlobalMap {

    private LocalMapData[][] map;
    private int width;
    private int height;

    private Vec2d startingLocation;

    // Generates once in the beginning of the game.
    // Generates in the constructor
    public GlobalMap(int w, int h) {

        width = w;
        height = h;

        map = new LocalMapData[w][h];

        for(int x = 0; x < w; x++) {
            for(int y = 0; y < h; y++) {
                map[x][y] = new LocalMapData(x, y, width, height,"flat");
            }
        }

        startingLocation = new Vec2d(Math.floor(Math.random()*width), Math.floor(Math.random()*height));
        map[((int) startingLocation.x)][((int) startingLocation.y)] =
                new LocalMapData(((int) startingLocation.x),
                        ((int) startingLocation.y), width, height, "startingLocation");
        // TODO Generate from main city map
        map[((int) startingLocation.x)][((int) startingLocation.y)].generateFromSource();

    }

    public void saveData(int x, int y, LocalMapData data) {
        map[x][y] = data;
    }

    public LocalMapData getStartingLocation() {
        return map[((int) startingLocation.x)][((int) startingLocation.y)];
    }

    public LocalMapData getLocalAt(int x, int y) {
        if(x >= 0 && x < width && y >= 0 && y < height) {
            if(!map[x][y].isGenerated()) {
                map[x][y].generate();
                return map[x][y];
            }
            else {
                return map[x][y];
            }

        }
        return null;
    }
}
