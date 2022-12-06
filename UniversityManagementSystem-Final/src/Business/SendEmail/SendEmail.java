/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SendEmail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;

/**
 *
 * @author ksiec
 */
public class SendEmail {
    
    public static void sendEmail(String recipient){

//    // email ID of Recipient.
//    String recipient = recipient;

    // email ID of  Sender.
    String sender = "sender@gmail.com";

    // using host as localhost
    String host = "127.0.0.1";

    // Getting system properties
    Properties properties = System.getProperties();

    // Setting up mail server
    properties.setProperty ("mail.smtp.host", host);
 
    // creating session object to get properties
    Session session = Session.getDefaultInstance(properties);

        try{
         // MimeMessage object.
         MimeMessage message = new MimeMessage(session);

        // Set From Field: adding senders email to from field.
        message.setFrom(new InternetAddress(sender));

        // Set To Field: adding recipient's email to from field.
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

        // Set Subject: subject of the email
        message.setSubject("Request Complete");

        // set body of the email.
        message.setText("Thank you for using our service. Your request has been completed.");

        // Send email.
        Transport.send(message);
    }
    catch (MessagingException mex){
    
         mex.printStackTrace();
    }
}
}
