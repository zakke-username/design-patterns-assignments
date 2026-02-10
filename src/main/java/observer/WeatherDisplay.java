package observer;

public class WeatherDisplay implements Observer {
    private WeatherStation ws;
    private String message;

    public WeatherDisplay(String message, WeatherStation ws) {
        this.ws = ws;
        this.message = message;
    }

    public void update() {
        int temp = ws.getTemp();
        System.out.print("\n" + this.message + "\nCurrent temperature: " + temp + "\n");
    }
}
