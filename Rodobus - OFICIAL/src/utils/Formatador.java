package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Formatador {

    public static String limparFormatoCPF(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }

    public static String limparFormatoTelefone(String telefone) {
        return telefone.replaceAll("[^0-9]", "");
    }
    
    public static boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
}