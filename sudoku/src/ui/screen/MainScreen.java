package ui.screen;

import java.awt.Dimension;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.GameStatusEnum;
import service.BoardService;
import ui.button.CheckGameStatusBtn;
import ui.button.FinishGameBtn;
import ui.button.ResetBtn;
import ui.frame.MainFrame;
import ui.panel.MainPanel;

public class MainScreen {
    private final BoardService boardService;
    private static Dimension dimension = new Dimension(600,600);
    private JButton checkGameStatusBtn;
    private JButton finishGameBtn;
    private JButton resetBtn;


    public MainScreen(final Map<String, String> gameConfig) {
        this.boardService = new BoardService(gameConfig);
    }

    public void buildMainScreen() {
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        addResetBtn(mainPanel);
        addFinishGameBtn(mainPanel);
        addCheckGameStatusBtn(mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private void addCheckGameStatusBtn(final JPanel mainPanel) {
        checkGameStatusBtn = new CheckGameStatusBtn(e -> {
            boolean hasErrors = boardService.hasErrors();
            GameStatusEnum gameStatus = boardService.getStatus();
            var message = switch(gameStatus) {
                case NON_STARTED -> "Não foi iniciado";
                case INCOMPLETED -> "Está incompleto";
                case COMPLETED -> "Está completo";
            };
            message += hasErrors ? " e contém erros" : "e não contém erros";
            JOptionPane.showMessageDialog( null, message);
        });
        mainPanel.add(checkGameStatusBtn);
    }

    private void addFinishGameBtn(final JPanel mainPanel) {
        finishGameBtn = new FinishGameBtn(e -> {
            if(boardService.gameIsFinished()) {
                JOptionPane.showMessageDialog(null, "Parabéns, você venceu o jogo!");
                resetBtn.setEnabled(false);
                checkGameStatusBtn.setEnabled(false);
                resetBtn.setEnabled(false);
            }
        });
        mainPanel.add(finishGameBtn);
    }

    private void addResetBtn(final JPanel mainPanel) {
        resetBtn = new ResetBtn(e -> {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Deseja realmente reiniciar o jogo?", "Reiniciar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(dialogResult == 0) {
                boardService.reset();
            }
        });
        

        mainPanel.add(resetBtn);
    }

}
