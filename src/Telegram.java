public class Telegram implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("Send Telegram message!");
    }

    @Override
    public void readMessage() {
        System.out.println("Telegram message read");
    }
}
