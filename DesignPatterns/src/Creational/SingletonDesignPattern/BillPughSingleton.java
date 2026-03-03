package Creational.SingletonDesignPattern;

/**
 *Advantages:
 * Lazy loading,
 * Thread-safe,
 * No synchronization overhead
 */

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    public static class Holder{
        public static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Holder.INSTANCE;
    }
}
