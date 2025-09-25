package ru.vsu.cs.computergraphic.sebeleva.task1;

import java.awt.Color;
import java.util.Random;

public class RandomColor {
    private Color color;
    private Color pastelColor;
    private Random random;

    public RandomColor() {
        this.random = new Random();
        this.pastelColor = generatePastelColor();
        this.color = generateColor();

    }

    private Color generatePastelColor() {
        int red = random.nextInt(128) + 127;
        int green = random.nextInt(128) + 127;
        int blue = random.nextInt(128) + 127;

        return new Color(red, green, blue);
    }

    private Color generateColor() {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return new Color(red, green, blue);
    }

    public Color getPastelColor() {
        return pastelColor;
    }

    public Color getColor() {
        return color;
    }

    public Color updatePastelColor() {
        pastelColor = generatePastelColor();
        return pastelColor;
    }

    public Color updateColor() {
        color = generateColor();
        return color;
    }

}
