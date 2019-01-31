/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.Arrays;
import java.util.List;
import java.util.*;
/**
 *
 * @author User
 */
public class theads {
    public static void main(String[] args) {
        int myNumber = 5;
        int num = 6;
        String s1 = new String("Who let the dogs out?");
        String s = "I have " + num + " cookies";
        
        System.out.println(myNumber);
        System.out.println("Hello, Harry!");
        System.out.println(s1);
        System.out.println(s);
        
        int a = 4;
        int result = a == 4 ? 1 : 8;
        System.out.println(a);
        // result will be 1
        // This is equivalent to
        //int result;
        if (a == 4) {
            result = 1;
        } else {
            result = 8;
        }
        System.out.println(a);
        
        //They need to be declared and then created.
        int[] arr;
        arr = new int[10];
        arr[0] = 4;
        arr[1] = arr[0] + 5;
        System.out.println(arr.length);
        System.out.println(arr[1]);
        
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        System.out.println(length);
        
        int series = 0;
        int[] arra = {1, 2, 3, 4};
        for (int i = 0; i < arra.length; i++) {
            series = series + arra[i];
            System.out.println("series" + series);
        }
       
        try {
            for (int i = 0; i < 10; i++) {
            System.out.println("Thread-1 " + i);
            Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread-1 Interrrupted");
        }
        
        List<Integer> list = Arrays.asList(3,2,1,4,5,6,6);
            System.out.println(list);
             // alternative you can declare the list via:
             // List<Integer> list = new ArrayList<>();
             // and use list.add(element); to add elements
            list.forEach((integer) -> {
           System.out.println(integer);
       });
        
        
    }
}
