package ru.vsu.cs.computergraphic.sebeleva.task1;
import ru.vsu.cs.computergraphic.sebeleva.task1.assist.*;
import ru.vsu.cs.computergraphic.sebeleva.task1.automats.*;
import ru.vsu.cs.computergraphic.sebeleva.task1.toys.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {
    private List<BackAutomats> backAutomats = new ArrayList<>();
    private List<FrontAutomats> frontAutomats = new ArrayList<>();
    private Color floorColor = new Color(192, 192, 192);
    private Color wallColor = new Color(240, 248, 255);
    //private Apple apple = new Apple(200, 200, 30);
    //private Сaterpillar caterpillar = new Сaterpillar(400, 100,30);
    //private Bear bear = new Bear(100, 100, 50);
    private Pig pig = new Pig(200,200, 70);

    public DrawPanel() {
        for (int x = -50; x <= 900; x += 150) {
            RandomColor col = new RandomColor();
            BackAutomats automat = new BackAutomats(x, 280, 90, 120, col.getPastelColor());
            backAutomats.add(automat);
        }

        for (int x = -300; x <= 2000; x += 500){
            RandomColor col = new RandomColor();
            RandomColor col2 = new RandomColor();
            FrontAutomats automats = new FrontAutomats(x,600, 600, 400, col.getPastelColor(), col2.getPastelColor());
            frontAutomats.add(automats);
        }

        Timer timer = new Timer(16, e -> repaint());
        timer.start();
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        g.setColor(wallColor);
        g.fillRect(0, 0, 800, 400);
        g.setColor(floorColor);
        g.fillRect(0, 350, 800, 500);

        for (BackAutomats automat : backAutomats) {
            automat.update();
            automat.draw(g);
        }
        for (FrontAutomats automat : frontAutomats) {
            automat.draw(g);
        }

        pig.draw(g);

        //bear.draw(g);
        //apple.draw(g);
        //caterpillar.draw(g);

    }
}