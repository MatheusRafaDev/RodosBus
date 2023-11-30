package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ValidarDataAno extends PlainDocument {

    private int limite;
    private int anoMaximo;

    public ValidarDataAno(int limite, int anoMaximo) {
        super();
        this.limite = limite;
        this.anoMaximo = anoMaximo;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) return;

        if (str.matches("\\d+")) {
            String textoAtual = getText(0, getLength());
            String novoTexto = textoAtual.substring(0, offset) + str + textoAtual.substring(offset);

            try {
                int numero = Integer.parseInt(novoTexto);
                if (novoTexto.length() <= limite && numero < anoMaximo) {
                    super.insertString(offset, str, attr);
                }
            } catch (NumberFormatException e) {
            }
        }
    }
}
