package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ValidarNumero extends PlainDocument {
    private int limit;

    public ValidarNumero(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) return;

        // Verifica se o texto a ser inserido contém apenas números
        if (str.chars().allMatch(Character::isDigit)) {
            // Verifica se o limite do comprimento não foi atingido
            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }
}
