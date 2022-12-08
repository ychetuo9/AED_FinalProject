package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 *
 */
public class GmailUtil {

    /**
     * given gmail account (e.g. **@artinfo.com), and password, send an email to the given address
     * @param fromEmailaddress
     * @param password
     * @param toEmailaddress
     * @param body
     * @param subject
     * @return
     */
    public static boolean sendEMail(String fromEmailaddress, String password, String toEmailaddress, String body, String subject) {
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtps.port", Integer.toString(456));
        props.put("mail.smtps.auth", Boolean.toString(true));
        Session session = Session.getDefaultInstance(props, null);

        MimeMessage message = new MimeMessage(session);

        try {

            // 设置不同的发件人        message.setFrom(new InternetAddress("from@no-spam.com"));


            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmailaddress));
            message.setSubject(subject);
            message.setContent(body, "text/html");

            Transport tr = session.getTransport("smtps");
            tr.connect( "smtp.gmail.com", 465, fromEmailaddress, password);
            tr.sendMessage(message, message.getAllRecipients());
            tr.close();
        } catch (AddressException e) {
            e.printStackTrace();
            return false;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String userEmail = null;
        String pass = null;
        String toEmail = null;
        String emailBody = null;
        String emailSubject = null;




        GmailUtil.sendEMail("thea.xiaoya@gmail.com", "sznrtvyqbnaookum",
                "thea.xiaoya@gmail.com", "emailBody", "emailSubject");



    }

}