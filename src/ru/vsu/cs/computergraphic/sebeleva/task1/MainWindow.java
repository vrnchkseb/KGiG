package ru.vsu.cs.computergraphic.sebeleva.task1;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() throws HeadlessException{
        dp = new DrawPanel();
        this.add(dp);
    }
}
