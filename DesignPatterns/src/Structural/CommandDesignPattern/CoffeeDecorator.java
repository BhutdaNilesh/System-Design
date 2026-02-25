package Structural.CommandDesignPattern;

abstract class CoffeeDecorator implements Coffee {

    Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    public double getPrice(){
        return coffee.getPrice();
    }

    public String getDescription(){
        return coffee.getDescription();
    }


}
