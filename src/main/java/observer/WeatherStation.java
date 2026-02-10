package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Observable implements Runnable {
    private int temp;
    private final int MAX_TEMP = 30;
    private final int MIN_TEMP = -30;
    private Random rand = new Random();
    private List<Observer> observers = new ArrayList<>();

    public WeatherStation() {
        this.temp = rand.nextInt(MAX_TEMP - MIN_TEMP) + MIN_TEMP;
    }

    public void updateTemp() {
        this.temp += rand.nextBoolean() ? 1 : -1;
        this.temp = Math.max(MIN_TEMP, Math.min(MAX_TEMP, this.temp));
    }

    public int getTemp() {
        return this.temp;
    }

    @Override
    public void run() {
        while (true) {
            updateTemp();
            notifyObservers();
            try {
                Thread.sleep(rand.nextInt(1, 6) * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
