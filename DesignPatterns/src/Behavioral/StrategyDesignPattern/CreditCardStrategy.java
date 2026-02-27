package Behavioral.StrategyDesignPattern;

public class CreditCardStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount+" via Credit Card");
    }
}
