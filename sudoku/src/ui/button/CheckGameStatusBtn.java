package ui.button;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class CheckGameStatusBtn extends JButton {
  public CheckGameStatusBtn(final ActionListener actionListener) {
    this.setText("Verificar jogo");
    this.addActionListener(actionListener);
  }

}
