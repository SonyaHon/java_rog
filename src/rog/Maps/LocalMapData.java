package rog.Maps;

import rog.Entitys.Entity;
import rog.Game.Tile;

import java.util.ArrayList;
import java.util.List;

public class LocalMapData {

    private String type;
    private Tile[][] map;
    private Entity playerEnt;
    private List<Entity> enities;

    private int x;
    private int y;

    private int width;
    private int height;

    private boolean isGenerated;

    public LocalMapData(int x, int y, int w, int h, String type){
        this.x = x;
        this.y = y;

        width = w;
        height = h;

        this.type = type;

        map = new Tile[width][height];

        isGenerated = false;
    }

    public void placePlayer(Entity pl) {
        this.playerEnt = pl;
    }

    public void generateFromSource() {
        // TODO generation from file
        FlatGenerator();
    }

    public void generate() {
        isGenerated = true;
        if(type.equals("flat")) {
            FlatGenerator();
        }
        else {
            //TODO more generators here
            FlatGenerator();
        }
    }

    // Map generators
    private void FlatGenerator() {

        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                map[x][y] = Tile.FloorTile(x, y);
            }
        }

        enities = new ArrayList<>();

    }

    //  Getters

    public List<Entity> getEnitiesList() {
        return enities;
    }

    public Entity getPlayer() {
        return playerEnt;
    }

    public Tile getTileAt(int x, int y) {
        if(x >= 0 && x < width && y >= 0 && y < height) {
            return map[x][y];
        }
        return null;
    }

    public boolean isGenerated() {
        return isGenerated;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Tile[][] getMap() {
        return map;
    }
}
