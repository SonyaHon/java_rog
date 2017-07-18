package rog.Entitys;

import com.sun.javafx.geom.Vec2d;
import rog.Game.Glyph;

// Base class for all entities

public class Entity {

    private String name;
    private Vec2d coordinates;
    private Glyph glyph;

    public Entity(String name, Vec2d coords, Glyph glyph) {
        this.name = name;
        coordinates = coords;
        this.glyph = glyph;

    }
}
