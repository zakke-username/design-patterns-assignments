package chainofresponsibility;

public class Main {
    static void main() {
        // Create handlers
        Handler compensationClaimHandler = new CompensationClaimHandler();
        Handler contactRequestHandler = new ContactRequestHandler();
        Handler developmentSuggestionHandler = new DevelopmentSuggestionHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();

        // Chain of responsibility
        compensationClaimHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextHandler(generalFeedbackHandler);

        // Messages
        Message[] messages = {
                new Message(MessageType.GENERAL_FEEDBACK, "Amazing service", "matti.meikäläinen@email.fi"),
                new Message(MessageType.CONTACT_REQUEST, "Please call me back, I haven't been able to contact support", "mikko.mallikas@email.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Fonts are too small and I can't see anything, help", "irmeli@email.net"),
                new Message(MessageType.COMPENSATION_CLAIM, "I WANT MY MONEY BACK!", "einari@email.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Your store is the worst ever", "asdfasdf@email.fi")
        };
        for (Message message : messages) {
            compensationClaimHandler.handleMessage(message);
        }
    }
}
