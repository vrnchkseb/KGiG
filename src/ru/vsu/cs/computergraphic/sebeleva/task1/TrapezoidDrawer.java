package ru.vsu.cs.computergraphic.sebeleva.task1;

import java.awt.*;

public class TrapezoidDrawer {
    private int x;
    private int y;
    private int bottomWidth;
    private int topWidth;
    private int height;
    private Color color;
    private boolean inverted;

    public TrapezoidDrawer(int x, int y, int bottomWidth, int topWidth, int height, Color color, boolean inverted) {
        this.x = x;
        this.y = y;
        this.bottomWidth = bottomWidth;
        this.topWidth = topWidth;
        this.height = height;
        this.color = color;
        this.inverted = inverted;
    }

    public void draw(Graphics2D g) {
        draw(g, x, y, bottomWidth, topWidth, height, color, inverted);
    }

    public static void draw(Graphics2D g, int x, int y, int bottomWidth, int topWidth, int height, Color color, boolean inverted) {
        int offset = (bottomWidth - topWidth) / 2;
        int[] xPoints, yPoints;
        if (!inverted) {
            xPoints = new int[]{ x, x + bottomWidth, x + bottomWidth - offset, x + offset };
            yPoints = new int[]{ y, y, y - height, y - height };
        } else {
            xPoints = new int[]{ x + offset, x + bottomWidth - offset, x + bottomWidth, x };
            yPoints = new int[]{ y, y, y + height, y + height };
        }
        Polygon trapezoid = new Polygon(xPoints, yPoints, 4);
        g.setColor(color);
        g.fill(trapezoid);
        g.setColor(Color.BLACK);
        g.draw(trapezoid);
    }
}
