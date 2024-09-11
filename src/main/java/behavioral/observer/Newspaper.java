package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Observable {
    private List<Observer> subsribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subsribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subsribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subsribers) {
            subscriber.handleEvent();
        }
    }

    public void releaseNewNewspaper() {
        System.out.println("Release new newspaper");
        notifyObservers();
    }
}
