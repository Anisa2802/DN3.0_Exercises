// Interface for the Notifier
interface Notifier {
    void send(String message);
}

// Concrete implementation of Notifier
class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}

// Abstract Decorator class implementing Notifier
abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}

// Concrete Decorator class for SMS notifications
class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}

// Concrete Decorator class for Slack notifications
class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}

// Test class to demonstrate the Decorator pattern
public class NotificationSystem {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        System.out.println("Sending with Email Notifier:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nSending with Email and SMS Notifier:");
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        System.out.println("\nSending with Email, SMS, and Slack Notifier:");
        emailSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}

