/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.threadsExecutorsRunnables;

/**
 *
 * @author User
 */
public class threadsExecutorsRunnables {

    public static void main(String[] args) {

        newThread thread = new newThread();
        thread.start();
        
        newRunnable runnable = new newRunnable();
        new Thread(runnable).start();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread-1 " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread-1 Interrrupted");
        }
    }
}
