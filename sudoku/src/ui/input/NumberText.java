package ui.input;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import model.Space;

public class NumberText extends JTextField {
    private Space space;

    public NumberText(final Space space) {
        this.space = space;
        Dimension dimension = new Dimension(50,50);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setVisible(true);
        this.setFont(new Font("Arial", Font.PLAIN, 20));
        this.setDocument(new NumberTextLimit());
        this.setEnabled(!space.isFixed());
        
        if(space.isFixed()) {
            this.setText(space.getActual().toString());
        }
    }
}
