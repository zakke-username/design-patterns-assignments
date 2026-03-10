package chainofresponsibility;

public class ContactRequestHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request from: " + message.getSenderEmail());
            System.out.println("Message: " + message.getContent());
            System.out.println("Sent contact request!\n");
        } else {
            super.handleMessage(message);
        }
    }
}
