package org.lab;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Treads {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //on simulement une tache longue
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Executing long  task ...");
            Thread.sleep(4000);
            return 42;
        });

        //d autres taches
        System.out.println("Doing other stuff");

        Integer result = future.get();
        System.out.println("Task completed with result " + result);

        executorService.shutdown();

    }
}
