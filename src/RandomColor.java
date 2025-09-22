import java.awt.Color;
import java.util.Random;

public class RandomColor {
    private Color color;
    private Random random;

    public RandomColor() {
        this.random = new Random();
        this.color = generatePastelColor();
    }

    private Color generatePastelColor() {
        int red = random.nextInt(128) + 127;
        int green = random.nextInt(128) + 127;
        int blue = random.nextInt(128) + 127;

        return new Color(red, green, blue);
    }

    public Color getColor() {
        return color;
    }
}
