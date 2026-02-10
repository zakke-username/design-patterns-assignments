package observer;

import java.util.*;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o ) {
        observers.add(o);
    }

    public void removeObserver(Observer o ) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
