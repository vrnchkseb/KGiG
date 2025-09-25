package ru.vsu.cs.computergraphic.sebeleva.task1.toys;
import ru.vsu.cs.computergraphic.sebeleva.task1.RandomColor;

import java.awt.*;

public class Сaterpillar {
    private int x, y, r;
    private RandomColor color = new RandomColor();

    public Сaterpillar(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw(Graphics2D g) {
        int tempX = x;
        for (int z = 0; z < 6; z++) {
            tempX-=r;
            g.setColor(color.updateColor());
            g.fillOval(tempX - r, y - r, 2 * r, 2 * r);
            g.setColor(Color.BLACK);
            g.drawOval(tempX - r, y - r, 2 * r, 2 * r);
        }
        for (int u = 0; u < 2; u++){
            g.setColor(Color.WHITE);
            g.fillOval(tempX, y,  r / 2, r / 2);
            g.setColor(Color.BLACK);
            g.fillOval(tempX, y, r / 3, r / 3);
            tempX-=r;
        }
    }
}
