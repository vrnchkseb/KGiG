package ru.vsu.cs.computergraphic.sebeleva.task1;

import java.awt.*;

public class FrontAutomats {
    private int x, y, width, height;
    private Color first, second;

    public FrontAutomats(int x, int y, int height, int width, Color first, Color second) {
        this.x = x;
        this.y = y;
        this.first = first;
        this.height = height;
        this.width = width;
        this.second = second;
    }

    public void draw(Graphics2D g) {
        TrapezoidDrawer.draw(g, x, y, width, (int) (width * 0.8), height / 12, first, false);
        TrapezoidDrawer.draw(g, x + ((width - ((int) (width * 0.8))) / 2), y, (int) (width * 0.8), (int) (width * 0.7) , height / 20, first.darker(), false);
        TrapezoidDrawer.draw(g, x + ((width - (int) (width * 0.8)) / 2), y - height / 9, (int) (width * 0.8),  (int) (width * 0.9), height / 40, second, true);

        TrapezoidDrawer.draw(g, x, y - height / 12 - height / 8, width, (int) (width * 1.1), height / 10, first, true);

        g.setColor(first);
        g.fillRect(x + width / 4, y - height / 12 - height / 8 - (int) (height * 0.2), width / 40, (int) (height * 0.2));
        g.setColor(Color.BLACK);
        g.drawRect(x + width / 4, y - height / 12 - height / 8 - (int) (height * 0.2), width / 40, (int) (height * 0.2));

        g.setColor(second);
        g.fillRect(x, y - height / 12 - height / 8 - width / 40, width, width / 40);
        g.setColor(Color.BLACK);
        g.drawRect(x, y - height / 12 - height / 8 - width / 40, width, width / 40);

        //джостик
        g.setColor(Color.BLUE);
        g.fillRect(x + (width / 2 - width / 12), y - (height / 9 + height / 50), width / 6, height / 50);
        g.setColor(Color.BLACK);
        g.drawRect(x + (width / 2 - width / 12), y - (height / 9 + height / 50), width / 6, height / 50);
        g.setColor(Color.BLUE);
        g.fillRect(x + width / 2 - width / 70, y - (height / 9 + +height/ 50 + height / 15), width / 35, height / 15);
        g.setColor(Color.BLACK);
        g.drawRect(x + width / 2 - width / 70, y - (height / 9 + +height/ 50 + height / 15), width / 35, height / 15);
        g.setColor(Color.BLUE);
        g.fillOval(x + width / 2 - width / 35, y - (height / 9 + +height/ 50 + height / 15) - width / 35, 2 * width / 35, 2 * width / 35);
        g.setColor(Color.BLACK);
        g.drawOval(x + width / 2 - width / 35, y - (height / 9 + +height/ 50 + height / 15) - width / 35, 2 * width / 35, 2 * width / 35);

        g.setColor(first);
        g.fillRect(x - (((int) (width * 1.1) - width) / 2), y - height / 12 - height / 8 - (int) (height * 0.6), width / 20, (int) (height * 0.6));
        g.setColor(Color.BLACK);
        g.drawRect(x - (((int) (width * 1.1) - width) / 2), y - height / 12 - height / 8 - (int) (height * 0.6), width / 20, (int) (height * 0.6));
        g.setColor(second);
        g.fillRect(x, y - height / 12 - height / 8 - (int) (height * 0.6), width / 40, (int) (height * 0.6));
        g.setColor(Color.BLACK);
        g.drawRect(x, y - height / 12 - height / 8 - (int) (height * 0.6), width / 40, (int) (height * 0.6));

        g.setColor(first);
        g.fillRect(x - (((int) (width * 1.1) - width) / 2) + width + width / 20, y - height / 12 - height / 8 - (int) (height * 0.6), width / 20, (int) (height * 0.6));
        g.setColor(Color.BLACK);
        g.drawRect(x - (((int) (width * 1.1) - width) / 2) + width + width / 20, y - height / 12 - height / 8 - (int) (height * 0.6), width / 20, (int) (height * 0.6));
        g.setColor(second);
        g.fillRect(x + width - width / 40, y - height / 12 - height / 8 - (int) (height * 0.6), width / 40, (int) (height * 0.6));
        g.setColor(Color.BLACK);
        g.drawRect(x + width - width / 40, y - height / 12 - height / 8 - (int) (height * 0.6), width / 40, (int) (height * 0.6));




    }
}
