
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
        "    <style>\n" +
        "        body {\n" +
        "            font-family: 'Arial', sans-serif;\n" +
        "            text-align: center;\n" +
        "            background-color: #f0f0f0;\n" +
        "            margin: 0;\n" +
        "            padding: 0;\n" +
        "            height: 700px;\n" +
        "            width: 700px;\n" +
        "            overflow: hidden;\n" +
        "        }\n" +
        "        .container {\n" +
        "            width: 80%;\n" +
        "            margin: 20px auto;\n" +
        "            padding: 20px;\n" +
        "            border: 1px solid #ddd;\n" +
        "            border-radius: 5px;\n" +
        "            background-color: #fff;\n" +
        "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
        "            max-height: 660px;\n" +
        "            overflow-y: auto;\n" +
        "        }\n" +
        "        .header {\n" +
        "            margin-bottom: 20px;\n" +
        "        }\n" +
        "        .header img {\n" +
        "            max-width: 100%;\n" +
        "            height: auto;\n" +
        "        }\n" +
        "        .header h2 {\n" +
        "            margin-top: 27px;\n" +
        "        }\n" +
        "        .details {\n" +
        "            margin-bottom: 15px;\n" +
        "            text-align: left;\n" +
        "        }\n" +
        "        .details label {\n" +
        "            display: inline-block;\n" +
        "            width: 150px;\n" +
        "            text-align: right;\n" +
        "            margin-right: 10px;\n" +
        "            font-weight: bold;\n" +
        "        }\n" +
        "        .details p {\n" +
        "            display: inline-block;\n" +
        "            margin: 0;\n" +
        "            text-align: left;\n" +
        "        }\n" +
        "        .details:last-child {\n" +
        "            margin-bottom: 0;\n" +
        "        }\n" +
        "        .contact-info {\n" +
        "            margin-top: 20px;\n" +
        "        }\n" +
        "        .details {\n" +
        "            margin-bottom: 10px;\n" +
        "            text-align: left;\n" +
        "        }\n" +
        "        .details label {\n" +
        "            display: inline-block;\n" +
        "            width: 150px;\n" +
        "            text-align: right;\n" +
        "            margin-right: 10px;\n" +
        "            font-weight: bold;\n" +
        "        }\n" +
        "        .details p {\n" +
        "            display: inline-block;\n" +
        "            margin: 0;\n" +
        "            text-align: left;\n" +
        "        }\n" +
        "        .descricao {\n" +
        "            margin-top: 50px;\n" +
        "            text-align: center;\n" +
        "        }\n" +
        "        h2 {\n" +
        "            margin-bottom: 30px;\n" +
        "        }\n" +
        "        .contact-info {\n" +
        "            margin-top: 20px;\n" +
        "            text-align: center;\n" +
        "        }\n" +
        "    </style>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <div class=\"container\">\n" +
        "        <div class=\"header\">\n" +
        "            <h2>Confirmação de Compra de Passagem de Ônibus</h2>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Número do Pedido:</label>\n" +
        "            <p>" + reserva.getCodigo() + "</p>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Data do Pedido:</label>\n" +
        "            <p>" + formatoBrasileiro.format(reserva.getDataReserva()) + "</p>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Origem:</label>\n" +
        "            <p>" + rota.getOrigem() + "</p>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Destino:</label>\n" +
        "            <p>" + rota.getDestino() + "</p>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Data da Viagem:</label>\n" +
        "            <p>" + formatoBrasileiro.format(rota.getDtSaida()) + "</p>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Assento Reservado:</label>\n" +
        "            <p>" + nrAssento + "</p>\n" +
        "        </div>\n" +
        "        <div class=\"details\">\n" +
        "            <label>Total Pago:</label>\n" +
        "            <p>" + reserva.getValorTotal() + "</p>\n" +
        "        </div>\n" +
        "        <p class=\"descricao\">Estamos empolgados por tê-lo(a) a bordo. Desejamos uma viagem agradável e tranquila!</p>\n" +
        "        <p>Se precisar de mais informações ou assistência, sinta-se à vontade para entrar em contato conosco.</p>\n" +
        "        <div class=\"contact-info\">\n" +
        "            <p>Atenciosamente,<br>Equipe RodoBus</p>\n" +
        "        </div>\n" +
        "        <p>© 2024 RodoBus. Todos os direitos reservados.</p>\n" +
        "    </div>\n" +
        "</body>\n" +
        "</html>";
        
        return emailBody;
    }
    
    public static String criarConteudoHTMLCancelamento(String CodigoReserva) {
  
        String emailBody = "<!DOCTYPE html>\n" +
        "<html>\n" +
        "<head>\n" +
        "    <title>Cancelamento de Reserva de Bilhete</title>\n" +
        "    <style>\n" +
        "        body {\n" +
        "            font-family: Arial, sans-serif;\n" +
        "        }\n" +
        "        .container {\n" +
        "            width: 500px;\n" +
        "            margin: 0 auto;\n" +
        "            padding: 20px;\n" +
        "            border: 1px solid #ddd;\n" +
        "            border-radius: 5px;\n" +
        "            background-color: #f9f9f9;\n" +
        "        }\n" +
        "        .header {\n" +
        "            text-align: center;\n" +
        "            margin-bottom: 20px;\n" +
        "        }\n" +
        "        .content {\n" +
        "            margin-bottom: 20px;\n" +
        "        }\n" +
        "        .content p {\n" +
        "            margin: 0;\n" +
        "            line-height: 1.5;\n" +
        "        }\n" +
        "    </style>\n" +
        "</head>\n" +
        "<body>\n" +
        "    <div class=\"container\">\n" +
        "        <div class=\"header\">\n" +
        "            <h1>Cancelamento de Reserva de Bilhete</h1>\n" +
        "        </div>\n" +
        "        <div class=\"content\">\n" +
        "            <p>Prezado Usuário,</p>\n" +
        "            <p>Lamentamos informar que o seu pedido de cancelamento da reserva de bilhete com a Rodobus foi processado com sucesso.</p>\n" +
        "            <p>Código da Reserva: <strong>" + CodigoReserva + "</strong></p>\n" +
        "            <p>Agradecemos por escolher a Rodobus. Esperamos poder atendê-lo novamente no futuro.</p>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "</body>\n" +
        "</html>";
        
        
        return emailBody;
    }
}
