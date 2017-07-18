package rog.Game;

import java.awt.*;

public class Tile extends Glyph {
    private int x;
    private int y;

    // Methods

    public static Tile FloorTile(int x, int y) {
        return new Tile(x, y, '.', new Color(66, 77,99));
    }

    // Constructors
    public Tile() {
        super();
        x = 0;
        y = 0;
    }

    public Tile(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Tile(int x, int y, Glyph glyph) {
        super(glyph.getChar(), glyph.getForeground(), glyph.getBackground());
        this.x = x;
        this.y = y;
    }

    public Tile(int x, int y, char ch) {
        super(ch);
        this.x = x;
        this.y = y;
    }

    public Tile(int x, int y, char ch, Color foreground) {
        super(ch, foreground);
        this.x = x;
        this.y = y;
    }

    public Tile(int x, int y, char ch, Color foreground, Color background) {
        super(ch, foreground, background);
        this.x = x;
        this.y = y;
    }

    // Getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
