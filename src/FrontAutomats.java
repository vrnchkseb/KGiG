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
        Graphics2D rect = (Graphics2D) g;
    }
}
