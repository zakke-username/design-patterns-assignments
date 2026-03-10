package chainofresponsibility;

public class DevelopmentSuggestionHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Received development suggestion from: " + message.getSenderEmail());
            System.out.println("Forwarded development suggestion: " + message.getContent() + "\n");
        } else {
            super.handleMessage(message);
        }
    }
}
