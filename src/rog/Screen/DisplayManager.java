package rog.Screen;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import rog.Game.Tile;
import rog.Maps.LocalMapData;

import javax.swing.*;
import java.awt.*;

public class DisplayManager extends JFrame{

    private AsciiPanel log;
    private AsciiPanel terminal;

    public DisplayManager() {
        super();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(800, 600);
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();

        container.setBackground(new Color(66,66,66));
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        log = new AsciiPanel(20, 60, AsciiFont.CP437_10x10);
        terminal = new AsciiPanel(60, 60, AsciiFont.CP437_10x10);
        container.add(log);
        container.add(terminal);
        this.pack();

        this.setVisible(true);
    }


    public void clearTerminal() {
        terminal.clear();
    }

    public  void refresh() {
        this.repaint();
        terminal.repaint();
    }

    public void drawTile(Tile tl) {
        terminal.write(tl.getChar(), tl.getX(), tl.getY(), tl.getForeground(), tl.getBackground());
    }

    public void drawMap(LocalMapData map) {
        for(int x = 0; x < map.getMap().length; x++) {
            for(int y = 0; y < map.getMap()[x].length; y++) {
                drawTile(map.getMap()[x][y]);
            }
        }
    }

    public int getScreenWidth() {
        return 60;
    }

    public int getScreenHeight() {
        return 60;
    }

}
