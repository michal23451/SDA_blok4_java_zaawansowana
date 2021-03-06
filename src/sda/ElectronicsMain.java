package sda;

import sda.electronics.EmailSender;
import sda.electronics.MailMachine;
import sda.electronics.Phone;
import sda.electronics.Tablet;

public class ElectronicsMain {

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung S10", "888-888-888");
        Phone iphone = new Phone("iPhone 11", "777-777-777");
        Tablet tablet = new Tablet("Galaxy Tab S6");

        EmailSender customEmailSender = new EmailSender() {
            @Override
            public void sendEmail(String message) {
                System.out.print("Idę do kolegi, żeby wysłał maila: " + message);
            }
        };

        MailMachine mailMachine = new MailMachine();
        mailMachine.addEmailSender(phone);
        mailMachine.addEmailSender(iphone);
        mailMachine.addEmailSender(customEmailSender);
        mailMachine.addEmailSender(tablet);

        mailMachine.sendEmail("Bardzo ważna wiadomość");
    }
}
