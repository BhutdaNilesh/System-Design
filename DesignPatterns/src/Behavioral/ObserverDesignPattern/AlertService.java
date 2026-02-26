package Behavioral.ObserverDesignPattern;

public class AlertService implements Observer {
    @Override
    public void update(double price) {

        if(price > 1000){
            System.out.println("Alert... Stock price is above 1000 and Price is: "+price);
        }
    }
}
