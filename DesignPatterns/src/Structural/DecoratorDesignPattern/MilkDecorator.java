package Structural.DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
