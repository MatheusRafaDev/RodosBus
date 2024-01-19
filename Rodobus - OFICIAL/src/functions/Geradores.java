
package functions;

import java.security.SecureRandom;


public class Geradores {
    public static String gerarCodigoAleatorio(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder codigoAleatorio = new StringBuilder();

        SecureRandom random = new SecureRandom();
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteres.length());
            codigoAleatorio.append(caracteres.charAt(index));
        }

        return codigoAleatorio.toString();
    }
}
