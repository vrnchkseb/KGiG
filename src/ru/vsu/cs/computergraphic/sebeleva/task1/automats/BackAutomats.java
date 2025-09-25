package ru.vsu.cs.computergraphic.sebeleva.task1.automats;

import ru.vsu.cs.computergraphic.sebeleva.task1.assist.RandomColor;
import ru.vsu.cs.computergraphic.sebeleva.task1.assist.TrapezoidDrawer;

import java.awt.*;

public class BackAutomats {
    private int x, y, width, height;
    private Color color;
    private Color changingColor;
    private RandomColor colors = new RandomColor();
    private long lastChange = 0;
    private long changeDelay = 300;

    public BackAutomats(int x, int y, int height, int width, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
        this.changingColor = colors.getColor();
    }


    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillRect(x,y,width,height);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,width,height);

        TrapezoidDrawer.draw(g, x, y, width,width - 10, 15, color.darker(), false);

        g.setColor(color);
        g.fillRect(x+5,y-15-height, width-10, height); // левый нижний
        g.setColor(Color.BLACK);
        g.drawRect(x+5,y-15-height, width-10, height);

        g.setColor(changingColor);
        g.fillRect(x+10,y-5-height, width-20, height-15);
        g.setColor(Color.BLACK);
        g.drawRect(x+10,y-5-height, width-20, height-15);

        TrapezoidDrawer.draw(g, x+5, y-25-height, width - 10, width + 10, 15, color.darker(), true);

        TrapezoidDrawer.draw(g, x-5, y-25-height, width + 10, width, 15, color, false);
    }

    public void update() {
        long now = System.currentTimeMillis();
        if (now - lastChange > changeDelay) {
            this.changingColor = colors.updateColor();
            lastChange = now;
        }
    }

}
