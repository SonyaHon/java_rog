package rog.Entitys.FixedCreatures;

import com.sun.javafx.geom.Vec2d;
import com.sun.javafx.scene.traversal.Direction;
import rog.Entitys.Ai.Ai;
import rog.Entitys.Entity;
import rog.Game.Glyph;

public class Player extends Entity{

    public Player(String name, Vec2d coords, Glyph glyph) {
        super(name, coords, glyph);
    }

    @Override
    public void setAis(Ai[] ais) {
        super.setAis(ais);
    }

    public void move(Direction dir) {
        switch (dir) {
            case UP:
                coordinates.y -= 1;
                break;
            case DOWN:
                coordinates.y += 1;
                break;
            case LEFT:
                coordinates.x -= 1;
                break;
            case RIGHT:
                coordinates.x += 1;
                break;
        }
    }
}
