package Behavioral.ObserverDesignPattern;


/*
Observer Design Pattern is the Behavioral design pattern which defines one-to-many dependency
so when one object changes its states, all dependents are notified automatically

Let's take the example of Stock Price System, where stock price changes, all price updates should reflect to
mobile, web and alert services which subscribed to that object

*/
public class ObserverMain {
    public static void main(String[] args) {

        Stock stock = new Stock();

        Observer mobile = new MobileApp();
        Observer web = new WebDashboard();
        Observer alert = new AlertService();

        stock.addObserver(mobile);
        stock.addObserver(web);
        stock.addObserver(alert);

        stock.setPrice(900);

        System.out.println("----------");
        stock.setPrice(1200);

    }
}
