package ui.button;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class ResetBtn extends JButton {
  public ResetBtn(final ActionListener actionListener) {
    this.setText("Reiniciar jogo");
    this.addActionListener(actionListener);
  }

}
