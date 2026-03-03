package Creational.SingletonDesignPattern;
/**
 * Now, To avoid Synchronization overhead, we are using Double-checked Locking principle.
 *
 * Double-Checked Locking is a pattern used to implement lazy initialization in a thread-safe manner
 * while minimizing synchronization overhead. It checks if the instance is null before and after acquiring the lock.
 * The first check avoids unnecessary locking after initialization.
 * The volatile keyword is required to prevent instruction reordering and ensure visibility, making the pattern safe in Java 5 and later.
 */

public class DCLSingleton {

    private static volatile DCLSingleton instance;

    private DCLSingleton(){

    }

    public static DCLSingleton getInstance(){
        if(instance == null){
            synchronized (DCLSingleton.class){
                if(instance == null){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
