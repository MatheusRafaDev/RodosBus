
package functions;

import java.text.SimpleDateFormat;
import model.Passageiro;
import model.Reserva;
import model.Rota;


public class ConstrutorHTML {
    
    public static String criarConteudoHTMLBoasVindas(Passageiro passageiro) {
         
        String emailBody = "<!DOCTYPE html>\n" +
        "<html lang=\"pt-br\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
        "    <title>Bem-Vindo ao Nosso Serviço de Vendas de Passagens</title>\n" +
        "</head>\n" +
        "<body style=\"margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 600px; width: 600px; background-color: #f4f4f4; color: #333; font-family: Arial, sans-serif;\">\n" +
        "<div style=\"text-align: center; padding: 20px;\">\n" +
        "    <h2>Bem-Vindo ao RodoBus!</h2>\n" +
        "\n" +
        "    <p>Olá " + passageiro.getNome() + " ,</p>\n" +
        "\n" +
        "    <p>É com grande prazer que damos as boas-vindas ao nosso sistema de vendas de passagens de ônibus! Estamos empolgados por tê-lo(a) conosco e esperamos que tenha uma experiência tranquila e eficiente ao utilizar nossos serviços.</p>\n" +
        "\n" +
        "    <p>Aqui estão algumas informações úteis para começar:</p>\n" +
        "\n" +
        "    <ol style=\"text-align: left;\">\n" +
        "        <li><strong>Perfil:</strong> Certifique-se de verificar e completar seu perfil. Isso garantirá que suas informações estejam corretas para facilitar o processo de compra de passagens.</li>\n" +
        "        <li><strong>Buscar Viagens:</strong> Explore as diferentes opções de destinos e horários disponíveis. Temos uma ampla variedade de rotas para atender às suas necessidades.</li>\n" +
        "        <li><strong>Reservar Assentos:</strong> Ao escolher sua viagem, aproveite a opção de reservar assentos. Isso proporcionará uma experiência mais personalizada durante sua jornada.</li>\n" +
        "    </ol>\n" +
        "\n" +
        "    <p>Estamos aqui para ajudar. Se tiver alguma dúvida ou precisar de assistência, não hesite em entrar em contato conosco.</p>\n" +
        "\n" +
        "    <p>Mais uma vez, seja bem-vindo(a) ao nosso serviço de vendas de passagens de ônibus! Estamos ansiosos para proporcionar uma experiência de viagem incrível.</p>\n" +
        "\n" +
        "    <p>Atenciosamente,<br>\n" +
        "    RodoBus<br>\n" +
        "\n" +
        "    <p style=\"color: #333; font-size: 12px;\">&copy; 2024 RodoBus. Todos os direitos reservados.</p>\n" +
        "</div>\n" +
        "</body>\n" +
        "</html>";
         
        return emailBody;
    }

    public static String criarConteudoHTMLConfirmacaoPedido(Reserva reserva, Rota rota, String nrAssento, Passageiro passageiro) {
        
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");
        
        String emailBody = "<!DOCTYPE html>\n" +
        "<html lang=\"pt-br\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
        "    <title>Bem-Vindo ao Nosso Serviço de Vendas de Passagens</title>\n" +
        "    <style>\n" +
        "        body {\n" +
        "            margin: 0;\n" +
        "            padding: 0;\n" +
        "            display: flex;\n" +
        "            justify-content: center;\n" +
        "            align-items: center;\n" +
        "            height: 600px;\n" +
        "            width: 600px;\n" +
        "            background-color: #f4f4f4;\n" +
        "            color: #333;\n" +
        "            font-family: Arial, sans-serif;\n" +
        "        }\n" +
        "        .container {\n" +
        "            text-align: center;\n" +
        "            padding: 20px;\n" +
        "            background-color: #fff;\n" +
        "            border-radius: 10px;\n" +
        "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
        "        }\n" +
        "        h2 {\n" +
        "            color: #333;\n" +
        "        }\n" +
        "        p {\n" +
        "            margin-bottom: 15px;\n" +
        "        }\n" +
        "        ul {\n" +
        "            list-style: none;\n" +
        "            padding: 0;\n" +
        "        }\n" +
        "        li {\n" +
        "            margin-bottom: 10px;\n" +
        "        }\n" +
        "        .footer {\n" +
        "            color: #333;\n" +
        "            font-size: 12px;\n" +
        "            margin-top: 20px;\n" +
        "        }\n" +
        "    </style>\n" +
        "</head>\n" +
        "<body>\n" +
        "<div class=\"container\">\n" +
        "    <h2>Pedido Realizado com Sucesso!</h2>\n" +
        "\n" +
        "    <p>Olá " + passageiro.getNome() + " ,</p>\n" +
        "\n" +
        "    <p>Seu pedido de passagem de ônibus foi confirmado. Agradecemos por escolher o RodoBus para sua viagem!</p>\n" +
        "\n" +
        "    <p>Aqui estão alguns detalhes do seu pedido:</p>\n" +
        "\n" +
        "    <ul>\n" +
        "        <li><strong>Número do Pedido:</strong> " + reserva.getIdReserva() + "</li>\n" +
        "        <li><strong>Data do Pedido:</strong> " + formatoBrasileiro.format(reserva.getDataReserva()) + "</li>\n" +
        "        <li><strong>Origem:</strong> " + rota.getOrigem() + "</li>\n" +
        "        <li><strong>Destino:</strong> " + rota.getDestino() + "</li>\n" +
        "        <li><strong>Data da Viagem:</strong> " + formatoBrasileiro.format(rota.getDtSaida()) + "</li>\n" +
        "        <li><strong>Assento Reservado:</strong> " + nrAssento + "</li>\n" +
        "        <li><strong>Total Pago:</strong> " + reserva.getValorTotal() + "</li>\n" +
        "    </ul>\n" +
        "\n" +
        "    <p>Estamos empolgados por tê-lo(a) a bordo. Desejamos uma viagem agradável e tranquila!</p>\n" +
        "\n" +
        "    <p>Se precisar de mais informações ou assistência, sinta-se à vontade para entrar em contato conosco.</p>\n" +
        "\n" +
        "    <p class=\"footer\">Atenciosamente,<br>\n" +
        "    Equipe RodoBus</p>\n" +
        "\n" +
        "    <p class=\"footer\">&copy; 2024 RodoBus. Todos os direitos reservados.</p>\n" +
        "</div>\n" +
        "</body>\n" +
        "</html>";
        
        return emailBody;
    }
}
