public class WhatsApp implements Messenger {
    @Override
    public void sendMessage() {
        System.out.println("Send WhatsApp message!");
    }

    @Override
    public void readMessage() {
        System.out.println("WhatsApp message read");
    }
}
