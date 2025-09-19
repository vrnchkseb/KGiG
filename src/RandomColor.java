import java.awt.Color;
import java.util.Random;

public class RandomColor {
    private Color color;
    private Random random;

    public RandomColor() {
        this.random = new Random();
        this.color = generateRandomColor();
    }

    private Color generateRandomColor() {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return new Color(red, green, blue);
    }

    public Color getColor() {
        return color;
    }
}