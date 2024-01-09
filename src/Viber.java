public class Viber implements Messenger {

    @Override
    public void sendMessage() {
        System.out.println("Send Viber message!");
    }

    @Override
    public void readMessage() {
        System.out.println("Viber message read");
    }
}
