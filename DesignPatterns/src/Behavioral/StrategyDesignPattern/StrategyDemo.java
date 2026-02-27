package Behavioral.StrategyDesignPattern;

/*
    Strategy design pattern is the Behavioral Design Pattern
    It defines a family of algorithms, encapsulate each one and make them interchangeable at runtime

    Let's take the example of Doing Payment as we have multiple payment methods like UPI, credit card and net banking.
    instead of writing the if else statements, we will choose the strategy pattern which will decide the which payment to choose at runtime
    It uses composition -> Payemnt context has the payment strategy
*/
public class StrategyDemo {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardStrategy());
        context.makePayment(1000);

        context.setStrategy(new UPIStrategy());
        context.makePayment(2000);

        context.setStrategy(new NetBankingStrategy());
        context.makePayment(3000);
    }

}
