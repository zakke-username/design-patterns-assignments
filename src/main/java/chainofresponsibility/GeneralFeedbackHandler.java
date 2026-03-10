package chainofresponsibility;

public class GeneralFeedbackHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Received feedback from: " + message.getSenderEmail());
            System.out.println("Processed feedback: " + message.getContent() + "\n");
        } else {
            super.handleMessage(message);
        }
    }
}
