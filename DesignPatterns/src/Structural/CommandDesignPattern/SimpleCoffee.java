package Structural.CommandDesignPattern;

public class SimpleCoffee implements Coffee {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
