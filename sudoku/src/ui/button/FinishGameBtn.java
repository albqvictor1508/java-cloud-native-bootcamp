package ui;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class FinishGameBtn extends JButton {
  public FinishGameBtn(final ActionListener actionListener) {
    this.setText("Finalizar jogo");
    this.addActionListener(actionListener);
  }

}
