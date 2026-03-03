package Creational.SingletonDesignPattern;

/** This is the Lazy initialization of Singleton Design Pattern.
 It is not thread safe,
 Multiple threads can create multiple instances
 */

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){

    }
    
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
