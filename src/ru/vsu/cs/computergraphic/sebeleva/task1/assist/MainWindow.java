package ru.vsu.cs.computergraphic.sebeleva.task1.assist;

import ru.vsu.cs.computergraphic.sebeleva.task1.DrawPanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel dp;

    public MainWindow() throws HeadlessException{
        dp = new DrawPanel();
        this.add(dp);
    }
}
