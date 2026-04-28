package facade;

public class Main {
    static void main() {
        ApiFacade facade = new ApiFacade();
        try {
            String joke = facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println("Chuck Norris joke:\n" + joke);

            String baseCurrency = facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "base");
            System.out.println("\nBase currency:\n" + baseCurrency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
