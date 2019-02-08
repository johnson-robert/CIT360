/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.threadsExecutorsRunnables;

/**
 * Rob Johnson
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++) {
            
            System.out.println("\n" + "Loop " + (i+1) + "\n");
            
            newThread thread = new newThread();
            thread.start();

            newRunnable runnable = new newRunnable();
            new Thread(runnable).start();
           
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
    }
}
