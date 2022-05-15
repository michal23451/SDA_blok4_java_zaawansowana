package sda.electronics;

public class MailMachine {

    private static final int MAX_ELEMENTS = 4;

    private EmailSender[] senders = new EmailSender[MAX_ELEMENTS];
    private int counter = 0;

    public void addEmailSender(EmailSender emailSender) {
        if (counter > MAX_ELEMENTS - 1) {
            System.out.println("Nie można dodać kolejnego email sender'a");
        }
        senders[counter] = emailSender;
        counter++;
        System.out.println("Dodano kolejny email sender");
    }

    public void sendEmail(String message) {
        for (EmailSender emailSender : senders) {
            emailSender.sendEmail(message);
        }
    }
}
