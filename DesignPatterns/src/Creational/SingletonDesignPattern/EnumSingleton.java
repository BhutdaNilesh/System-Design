package Creational.SingletonDesignPattern;

/**
 * Thread Safe,
 * Safe against reflection
 * Safe against serialization
 * Recommended by Efficient java
 */

public enum EnumSingleton {
    INSTANCE;

    public void doSomething(){
        System.out.println("Do Something...");
    }
}
