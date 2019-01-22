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
public class singleThread {
     public static void main(String[] args) {
         try {
            for (int i = 0; i < 10; i++) {
            System.out.println("Loop-1 " + i);
            Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Loop-1 Interrrupted");
        }
         
        try {
            for (int i = 0; i < 10; i++) {
            System.out.println("Loop-2 " + i);
            Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Loop-2 Interrrupted");
        }
     }
}
