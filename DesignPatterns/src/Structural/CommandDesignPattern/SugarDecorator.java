package Structural.CommandDesignPattern;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
