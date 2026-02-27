package Behavioral.StrategyDesignPattern;

public class NetBankingStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount+" via Net Banking");
    }
}
