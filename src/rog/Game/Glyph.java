package rog.Game;


import java.awt.*;

public class Glyph {
    private char _char;
    private Color foreground;
    private Color background;


    // Constructors
    public Glyph() {
        _char = ' ';
        foreground = Color.white;
        background = Color.black;
    }

    public Glyph(char ch) {
        _char = ch;
        foreground = Color.white;
        background = Color.black;
    }

    public Glyph(char ch, Color fg) {
        _char = ch;
        foreground = fg;
        background = Color.black;
    }

    public Glyph(char ch, Color fg, Color bg) {
        _char = ch;
        foreground = fg;
        background = bg;
    }

    //Getters
    public char getChar() {
        return _char;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }
}
