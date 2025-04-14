package ui.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;


public class MainFrame extends JFrame {
    public MainFrame(final Dimension dimension, final JPanel mainPanel) {
        super("Sudoku");
        this.setSize(dimension);
        this.setPreferredSize(dimension);
    }
}
