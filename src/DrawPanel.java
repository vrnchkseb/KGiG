import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {
    private List<BackAutomats> automats = new ArrayList<>();
    private Color floorColor = new Color(192, 192, 192);
    private Color wallColor = new Color(240, 248, 255);

    public DrawPanel() {
        for (int x = 50; x <= 800; x += 150) {
            RandomColor cl = new RandomColor();
            RandomColor cl2 = new RandomColor();
            BackAutomats automat = new BackAutomats(x, 280, 90, 120, cl.getColor(), cl2.getColor());
            automats.add(automat);
        }
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        g.setColor(wallColor);
        g.fillRect(0, 0, 800, 400);
        g.setColor(floorColor);
        g.fillRect(0, 350, 800, 500);
        for (BackAutomats automat : automats) {
            automat.draw(g);
        }
    }
}