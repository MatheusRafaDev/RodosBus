package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ValidarLetras extends PlainDocument {

    private int limite;

    public ValidarLetras(int limite) {
        super();
        this.limite = limite;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) return;

        if (str.matches("[a-zA-Z.,;:'\"!?\\s]+")) {
            if ((getLength() + str.length()) <= limite) {
                super.insertString(offset, str, attr);
            }
        }
    }
}
