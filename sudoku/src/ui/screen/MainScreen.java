package ui.screen;

import java.awt.Dimension;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.frame.MainFrame;
import ui.panel.MainPanel;

public class MainScreen {
    private static Dimension dimension = new Dimension(600,600);
    private JButton finishGameBtn;
    private JButton resetBtn;
    private JButton checkGameStatusBtn;

    public MainScreen(final Map<String, String> gameConfig) {
        // this.boardService = new BoardService(gameConfig);
    }

    public void buildMainScreen() {
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        addResetBtn();
        addFinishGameBtn();
        addCheckGameStatusBtn();
        mainFrame.revalidate();
        mainFrame.repaint();
        
    }

    private void addCheckGameStatusBtn(final JPanel mainPanel) {
        mainPanel.add(checkGameStatusBtn);
    }

    private void addFinishGameBtn(final JPanel mainPanel) {
        mainPanel.add(finishGameBtn);
    }

    private void addResetBtn(final JPanel mainPanel) {
        mainPanel.add(resetBtn);
    }

}
