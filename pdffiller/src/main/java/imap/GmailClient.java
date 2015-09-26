package imap;


import org.apache.commons.lang3.RandomStringUtils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * Created by ANS on 29/07/15.
 */
public class GmailClient {
    private static final String EMAIL ="test007@pdffiller.com";
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

    public static void GetEmail (String button) {
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
                if (msg.getSubject().equals(button)){
                    String g = (String) msg.getContent();
                    String url = g.substring(g.indexOf("click <a href=\"") + "click <a href=\"".length(), g.indexOf("\">here</a>.</p>"));
                    PageObject.openUrl(url);

                    break;
                }
            }

        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }

    public static String CheckTextInEmail (String subject) {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        String url = null;
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", EMAIL, PASSWORD);
            Folder inbox = store.getFolder("INBOX");

            inbox.open(Folder.READ_ONLY);
            for (int i = 1 ; i<inbox.getMessageCount();i++){
                Message msg = inbox.getMessage(i);
                if (msg.getSubject().equals(subject)){
                    String g = (String) msg.getContent();
                    File fileToDelete = new File("/Users/ANS/Documents/JAVA/htmlForGmail");
                            fileToDelete.delete();
                    File file = save("/Users/ANS/Documents/JAVA/htmlForGmail",g);
                    url = "file:///"+file.getAbsolutePath().replaceAll("\n", "/");
                    PageObject.openUrl(url);

                    return url;

                }
            }

            return url;
        } catch (Exception mex) {
            mex.printStackTrace();
            return url;
        }

    }

    public static File save(String folder,String content) throws FileNotFoundException, UnsupportedEncodingException {
        new File(folder).mkdirs();
        String name = RandomStringUtils.randomAlphanumeric(10).toLowerCase()
                + "_" + System.currentTimeMillis();
        PrintWriter pw = null;

        pw = new PrintWriter(folder + "/" + name + ".html", "UTF-8");
        pw.write("\uFEFF");
        pw.write(content);
        pw.flush();
        pw.close();

        System.out.println("Message content saved: " + folder + "/" + name + ".html");
        return new File(folder + "/" + name + ".html");
    }
}
