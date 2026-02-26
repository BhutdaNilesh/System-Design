package Behavioral.ObserverDesignPattern;

public class WebDashboard implements Observer {
    @Override
    public void update(double price) {
        System.out.println("Web Dashboard has been notified: "+price);
    }
}
