package com.company.PdfFiller;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Никита on 06/17/15.
 */
public class GmailClient{

    private static final String EMAIL ="ageevnikitatest@gmail.com";
    private static final String PASSWORD = "kifoR1996";

    public static void SendEmail(String[] args) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("username", "password");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from@no-spam.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("to@no-spam.com"));
            message.setSubject("Testing Subject");
            message.setText("Dear Mail Crawler," +
                    "\n\n No spam to my email, please!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }



    public static void GetEmail () {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", EMAIL, PASSWORD);
            Folder inbox = store.getFolder("INBOX");

            inbox.open(Folder.READ_ONLY);
            for (int i = 1 ; i<inbox.getMessageCount();i++){
                Message msg = inbox.getMessage(i);
                if (msg.getSubject().equals(Share.G)){
                    String g = (String) msg.getContent();
                    String url = g.substring(g.indexOf("click <a href=\"") + "click <a href=\"".length(), g.indexOf("\">here</a>.</p>"));
                    P_O.OpenUrl(url);


                    break;
                }
            }


        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

}
