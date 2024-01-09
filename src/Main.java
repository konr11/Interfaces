
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        App app = new App();
        app.useMessenger(new Telegram());
        app.useMessenger(new WhatsApp());
        app.useMessenger(new Viber());

    }
}