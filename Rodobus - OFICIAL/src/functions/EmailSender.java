package functions;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    private String fromEmail;
    private String password;
    private String toEmail;
    private String emailSubject;
    private String emailBody;

    public EmailSender(String fromEmail, String password, String toEmail, String emailSubject, String emailBody) {
        this.fromEmail = fromEmail;
        this.password = password;
        this.toEmail = toEmail;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }

    public void sendEmail() {
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
            message.setContent(emailBody, "text/html");
            
            new Thread(() -> {
                try {
                    Transport.send(message);
                    System.out.println("Email sent successfully");
                } catch (MessagingException e) {
                    handleSendException(e);
                }
            }).start();
        } catch (MessagingException e) {
            handleSendException(e);
        }
    }

    private void handleSendException(MessagingException e) {
        e.printStackTrace();
    }
}
