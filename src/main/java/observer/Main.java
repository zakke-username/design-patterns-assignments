package observer;

public class Main {
    static void main() {
        WeatherStation ws = new WeatherStation();

        WeatherDisplay wd1 = new WeatherDisplay("Message from display ONE:", ws);
        WeatherDisplay wd2 = new WeatherDisplay("Message from display TWO:", ws);
        WeatherDisplay wd3 = new WeatherDisplay("Message from display THREE:", ws);

        ws.registerObserver(wd1);
        ws.registerObserver(wd2);
        ws.registerObserver(wd3);

        try {
            Thread t = new Thread(ws);
            t.start();
            Thread.sleep(10000);
            System.out.println("\nREMOVING A DISPLAY...");
            ws.removeObserver(wd3);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
    }
}
