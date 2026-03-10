package chainofresponsibility;

public class CompensationClaimHandler extends Handler {
    @Override
    public void handleMessage(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Processing compensation claim from: " + message.getSenderEmail());
            System.out.println("Message: " + message.getContent());
            System.out.println("Claim approved\n");
        } else {
            super.handleMessage(message);
        }
    }
}
