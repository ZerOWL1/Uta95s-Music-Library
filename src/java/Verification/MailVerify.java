/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Verification;

/**
 *
 * @author Ryuu
 */
import Entity.Mail;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailVerify {

    //generate vrification code
    public String getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    //send email to the user email
    public boolean sendEmail(Mail mail) {
        boolean test = false;

        // Recipient's email ID needs to be mentioned.
        String toEmail = mail.getMail();//change accordingly
        
//        String toEmail = "haildhe141223@fpt.edu.vn";
        
        // Sender's email ID needs to be mentioned
        String from = "uta95s.verify@gmail.com";
        final String username = "uta95s.verify@gmail.com";
        final String password = "pokemonlol123478kid";

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "smtp.gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));

            // Set Subject: header field
            message.setSubject("Uta95s Verification");

            // Now set the actual message
            message.setText("Before change profile!!. Please verify your account using this code: " + mail.getCode() + "");

            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");
            test = true;
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        return test;
    }
    
    public static void main(String[] args) {
//        MailVerify m = new MailVerify();
//        String code = m.getRandom();
//        Mail mail = new Mail("123", "hello", "haildhe141223@fpt.edu.vn", "123", code);
//        boolean test = m.sendEmail(mail);
    }
}
