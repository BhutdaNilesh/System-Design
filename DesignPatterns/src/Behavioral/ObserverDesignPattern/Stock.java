package Behavioral.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{

    List<Observer> observers = new ArrayList<Observer>();
    private double price;

    void setPrice(double price){
        this.price = price;
        notifyObservers();
    }

    double getPrice(){
        return this.price;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(price);
        }
    }
}
