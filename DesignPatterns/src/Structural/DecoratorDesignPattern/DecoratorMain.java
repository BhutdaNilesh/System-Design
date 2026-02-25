package Structural.DecoratorDesignPattern;


/*
 Decorator Design Pattern is a structural Design Pattern where we add additional responsibilities / features
 to an object without modifying its structure.

 To Learn this we will take the simple example of implementing the Coffee maching where we will add flavors dynamically
*/

public class DecoratorMain {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> Total Cost: "+ coffee.getPrice());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Total Cost: "+ coffee.getPrice());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Total Cost: "+ coffee.getPrice());

    }


}
