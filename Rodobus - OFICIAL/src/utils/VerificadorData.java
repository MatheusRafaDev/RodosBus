package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class VerificadorData {
    
    public boolean verificarData(JFormattedTextField txtCHEGADA4, JFormattedTextField txtSAIDA4) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String inputTextChegada = txtCHEGADA4.getText().trim();
        Date chegada = parseDate(inputTextChegada, sdf);

        if (chegada == null) {
            showError("Formato de data de chegada é inválido.");
            return false;
        }

        String inputTextSaida = txtSAIDA4.getText().trim();
        Date saida = parseDate(inputTextSaida, sdf);

        if (saida == null) {
            showError("Formato de data de saída é inválido.");
            return false;
        }

        if (saida.after(chegada)) {
            showError("A data de chegada não pode ser antes da data de saída.");
            return false;
        }

        if (saida.before(new Date())) {
            showError("A data de saída não pode ser anterior à data atual.");
            return false;
        }

        txtCHEGADA4.setValue(sdf.format(chegada));
        txtSAIDA4.setValue(sdf.format(saida));

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
