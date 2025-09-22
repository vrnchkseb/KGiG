package toys;
import java.awt.*;

public class Apple {
    private int x, y, r;

    public Apple(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        g.setColor(Color.BLACK);
        g.drawOval(x - r, y - r, 2 * r, 2 * r);

        g.setColor(Color.GREEN);
        g.rotate(Math.toRadians(-30), x, y - r / 2);
        g.fillOval(x, y - 2 * r, r / 2, r);
        g.setColor(Color.BLACK);
        g.drawOval(x, y - 2 * r, r / 2, r);
        g.rotate(Math.toRadians(30), x, y - r / 2);

    }
}

