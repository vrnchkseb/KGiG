import java.awt.*;
import java.util.Random;

public class BackAutomats {
    private int x, y, width, height;
    private Color first, second;
    private Color changingColor;
    private Random rand = new Random();

    public BackAutomats(int x, int y, int height, int width, Color first, Color second) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.first = first;
        this.second = second;
        changingColor = generateRandomColor();
    }

    private Color generateRandomColor() {
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    public void updateColor() {
        changingColor = generateRandomColor();
    }

    public void draw(Graphics2D g){
        g.setColor(first);
        g.fillRect(x,y,width,height);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,width,height);

        TrapezoidDrawer trapezoid = new TrapezoidDrawer(x, y, width,width - 10, 15, second, false);
        trapezoid.draw(g);

        g.setColor(first);
        g.fillRect(x+5,y-15-height, width-10, height); // левый нижний

        g.setColor(changingColor);
        g.fillRect(x+10,y-5-height, width-20, height-15);

        TrapezoidDrawer trapezoid2 = new TrapezoidDrawer(x+5, y-25-height, width - 10, width + 10, 15, second, true);
        trapezoid2.draw(g);

        TrapezoidDrawer trapezoid3 = new TrapezoidDrawer(x-5, y-25-height, width + 10, width, 15, first, false);
        trapezoid3.draw(g);
    }
}
