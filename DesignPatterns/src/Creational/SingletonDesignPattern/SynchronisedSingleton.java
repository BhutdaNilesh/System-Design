package Creational.SingletonDesignPattern;


/**
 * A simple way to create a thread-safe singleton class is to make the global access method synchronized so that only one thread can execute this method at a time.

 Synchronization introduces performance overhead due to lock acquisition and release costs,
 reduced parallelism, context switching, memory barriers, and cache coherency traffic.
 Under high contention, threads block and the OS performs context switches, reducing scalability.
 However, modern JVM optimizations like biased and lightweight locking reduce overhead in low-contention scenarios.

 */

public class SynchronisedSingleton {

    private static SynchronisedSingleton instance;

    private SynchronisedSingleton(){

    }

    public static synchronized SynchronisedSingleton getInstance(){
        if(instance == null){
            instance = new SynchronisedSingleton();
        }
        return instance;
    }
}
