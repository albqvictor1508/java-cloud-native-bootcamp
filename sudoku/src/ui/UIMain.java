package ui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.frame.MainFrame;
import ui.panel.MainPanel;

public class UIMain {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(600,600);
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
