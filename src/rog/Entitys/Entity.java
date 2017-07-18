package rog.Entitys;

import com.sun.javafx.geom.Vec2d;
import rog.Entitys.Ai.Ai;
import rog.Game.Glyph;

// Base class for all entities

public class Entity {

    private String name;
    protected Vec2d coordinates;
    private Glyph glyph;
    protected Ai[] ais;

    public Entity(String name, Vec2d coords, Glyph glyph) {
        this.name = name;
        coordinates = coords;
        this.glyph = glyph;

    }

    public void setAis(Ai[] ais) {
        this.ais = ais;
    }

    public int getX() {
        return (int)coordinates.x;
    }

    public int getY() {
        return (int)coordinates.y;
    }

    public String getName() {
        return name;
    }

    public Vec2d getCoordinates() {
        return coordinates;
    }

    public Glyph getGlyph() {
        return glyph;
    }
}
