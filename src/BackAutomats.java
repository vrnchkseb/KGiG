import java.awt.*;

public class BackAutomats {
    private int x, y, width, height;
    private Color first, second;

    public BackAutomats(int x, int y, int height, int width, Color first, Color second) {
        this.x = x;
        this.y = y;
        this.first = first;
        this.height = height;
        this.width = width;
        this.second = second;
    }

    public void draw(Graphics2D g){
        Graphics2D rect = (Graphics2D) g;
        rect.setColor(first);
        rect.fillRect(x,y,width,height);

        Graphics2D g2 = (Graphics2D) g;
        int[] xPoints = {x, x+5, x+width-5, x+width};
        int[] yPoints = {y, y-15, y-15, y};
        Polygon trapezoid = new Polygon(xPoints, yPoints, 4);
        g2.setColor(second);
        g2.fill(trapezoid);

        g2.setColor(first);
        rect.fillRect(x+5,y-15-height, width-10, height);//левый нижний

        g2.setColor(Color.black);
        rect.fillRect(x+10,y-5-height, width-20, height-15);

        int[] xPoints2 = {x+5, x-5, x+5+width, x+width-5};
        int[] yPoints2 = {y-15-height, y-25-height, y-25-height, y-15-height};
        Polygon trapezoid2 = new Polygon(xPoints2, yPoints2, 4);
        g2.setColor(second);
        g2.fill(trapezoid2);

        int[] xPoints3 = {x-5, x+5, x+width-5, x+width+5};
        int[] yPoints3 = {y-25-height, y-35-height, y-35-height, y-25-height};
        Polygon trapezoid3 = new Polygon(xPoints3, yPoints3, 4);
        g2.setColor(first);
        g2.fill(trapezoid3);

    }

    public int getWidth(){
        return width;
    }
}
