/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SendEmail;

import Business.Student.Student;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JOptionPane;

/**
 *
 * @author ksiec
 */
public class SendEmail {
    
    public static void sendEmail(String recipient, Student user){

    // email ID of Recipient.
    String to = recipient;

    // email ID of  Sender.
    String sender = "sprucestudentsystem@gmail.com";
    String pass = "waidowrmaazsubqj";

    // using host
    // Getting system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        
    // Setting up mail server
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", sender);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        
    // creating session object to get properties
        Session session = Session.getDefaultInstance(properties);

        try{
         // MimeMessage object.
         MimeMessage message = new MimeMessage(session);

        // Set From Field: adding senders email to from field.
        message.setFrom(new InternetAddress(sender));

        // Set To Field: adding recipient's email to from field.
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        // Set Subject: subject of the email
        message.setSubject("Request Complete");

        // set body of the email.
        message.setText("Dear " + user.getName() + " : " + "Thank you for using our service. Your request has been completed.");

        // Send email.
        Transport transport = session.getTransport("smtp");
        transport.connect(host, sender, pass);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException mex){
    
         mex.printStackTrace();
         JOptionPane.showMessageDialog(null, "Invalid email");
    }
}
}
