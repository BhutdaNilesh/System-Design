package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable is an interface in java present in java.util.concurrent package.
 * It represents the task which can be executed by Threads and return the value. Unlike runnable, it return a value and can throw checked exceptions
 * <p>
 * it can be used with Executor service for asynchronous or concurrent execution.
 * result of Callable are obtained in Future object
 */


public class CallableExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();


        Callable<Integer> task = () -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                //
            }
            System.out.println("Doing the task...");
            return 20;
        };

        Future<Integer> submit = executor.submit(task);

        try {
            Integer taskResult = submit.get();
            System.out.println(taskResult);
        } catch (Exception e) {
            //
        }

        executor.shutdown();
    }
}
