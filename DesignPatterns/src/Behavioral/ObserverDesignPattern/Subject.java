package Behavioral.ObserverDesignPattern;


// Subject is the publisher who maintains all list of observers



public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
