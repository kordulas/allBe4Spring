import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("jakub.kordulasinski", "Jakub1234"));
        email.setSSLOnConnect(true);
        email.setFrom("jakub.kordulasinski@interia.pl");
        email.setSubject("Siemaa");
        email.setMsg("Witam, robię super kurs programowania!");
        email.addTo("kordulas18@onet.eu");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}