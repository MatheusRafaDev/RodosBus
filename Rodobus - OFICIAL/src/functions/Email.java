package functions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Passageiro;
import model.Reserva;
import model.Rota;

public class Email {
    private String fromEmail;
    private String password;
    private String toEmail;
    private String emailSubject;
    private String emailBody;
    private String emailType;
    
    public Email(String fromEmail, String password, String toEmail, String emailSubject, String emailBody, String emailType) {
        this.fromEmail = "rodobusproject@gmail.com";
        this.password = "mfgh atcd slca iajo";
        this.toEmail = toEmail;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
        this.emailType = emailType;
    }

    
        
    public void EnviarEmail() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(emailSubject);
            message.setText(emailBody);
            
            if (emailType.equals("html")) {
                message.setContent(emailBody, "text/html");
            }
                        
            
            new Thread(() -> {
                try {
                    Transport.send(message);
                    
                } catch (MessagingException e) {
                    
                }
            }).start();
        } catch (MessagingException e) {
            
        }
    }
    
    public void enviarConfirmacaoPedido(Reserva reserva, Rota rota, String nrAssento, Passageiro passageiro) {

        this.emailSubject = "Confirmação de pedido";
        this.emailType = "html";
        
        String emailBody = ConstrutorHTML.criarConteudoHTMLConfirmacaoPedido(reserva,rota ,nrAssento, passageiro);

        Email email = new Email(fromEmail, password, toEmail, emailSubject, emailBody, emailType);
        email.EnviarEmail();
    }

    public void enviarBoasVindas(Passageiro passageiro) { 
        
        this.emailSubject = "Seja bem vindo(a) à RodoBus";
        this.emailType = "html";
        
        String emailBody = ConstrutorHTML.criarConteudoHTMLBoasVindas(passageiro);


        Email email = new Email(fromEmail, password, toEmail, emailSubject, emailBody, emailType);
        email.EnviarEmail();
    }
    
    public void enviarCancelamento(Passageiro passageiro,Reserva reserva) { 

        this.emailSubject = "Cancelamento de Reserva de Bilhete";
        this.emailType = "html";
        
        String emailBody = ConstrutorHTML.criarConteudoHTMLCancelamento(String.valueOf(reserva.getCodigo()));


        Email email = new Email(fromEmail, password, toEmail, emailSubject, emailBody, emailType);
        email.EnviarEmail();
    }
    
    public void enviarRecuperacao(String codigo) { 
        
        this.emailSubject = "Código de verificação";
        this.emailType = "html";
        
        String emailBody = ConstrutorHTML.criarConteudoHTMLRecuperacaoSenha(codigo);


        Email email = new Email(fromEmail, password, toEmail, emailSubject, emailBody, emailType);
        email.EnviarEmail();
    }
    
    public void enviarSenha(String senha) { 
        
        this.emailSubject = "Confirmação de Senha";
        this.emailType = "html";
        
        String emailBody = ConstrutorHTML.criarConteudoHTMLConfirmacaoSenha(senha);


        Email email = new Email(fromEmail, password, toEmail, emailSubject, emailBody, emailType);
        email.EnviarEmail();
    }
}
