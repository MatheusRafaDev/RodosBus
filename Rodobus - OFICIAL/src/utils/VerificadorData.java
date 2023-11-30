package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class VerificadorData {

    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public boolean verificarData(JFormattedTextField txtCHEGADA4, JFormattedTextField txtSAIDA4) {
        String inputText = txtCHEGADA4.getText().trim();
        Date date = parseDate(inputText, sdf1);

        if (date == null) {
            date = parseDate(inputText, sdf2);
        }

        if (date != null) {
            txtCHEGADA4.setValue(sdf1.format(date));
        } else {
            showError("Formato de data de chegada é inválido.");
            return false;
        }

        String inputText2 = txtSAIDA4.getText().trim();
        Date date2 = parseDate(inputText2, sdf2);

        if (date2 == null) {
            date2 = parseDate(inputText2, sdf2);
        }

        if (date2 != null) {
            txtSAIDA4.setValue(sdf1.format(date2));
        } else {  
            showError("Formato de data de saída é inválido.");
            return false;
        }

        return true;
    }

    private static Date parseDate(String input, SimpleDateFormat sdf) {
        try {
            sdf.setLenient(false);
            return sdf.parse(input);
        } catch (ParseException e) {
            return null;
        }
    }

    private static void showError(String errorMessage) {
        System.err.println(errorMessage);
        JOptionPane.showMessageDialog(null, errorMessage, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
