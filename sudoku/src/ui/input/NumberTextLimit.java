package ui.input;

import static java.util.Objects.isNull;

import java.util.List;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class NumberTextLimit extends PlainDocument {
        private final List<String> NUMBERS = List.of("","","","","","","","","");

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(isNull(str) || (!NUMBERS.contains(str))) return;

        if(getLength() + str.length() <= 1) {
            super.insertString(offs, str, a);
        }
    }
}
