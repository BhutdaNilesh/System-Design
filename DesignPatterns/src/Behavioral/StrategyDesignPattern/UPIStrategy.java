package Behavioral.StrategyDesignPattern;

public class UPIStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount+" via UPI");
    }
}
