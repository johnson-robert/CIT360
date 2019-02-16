/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author User
 */
public class myOtherFunc {
    
    public int func1(int a) {
        //if then
        int result = a == 4 ? 1 : 8;
        return result;
    }

    public int func2(final String letter) {
        //Map
        System.out.println("Maping the Alphabet");
        Map< String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", new Integer(1));
        alphabet.put("b", new Integer(2));
        alphabet.put("c", new Integer(3));
        alphabet.put("y", new Integer(25));
        alphabet.put("z", new Integer(26));

        System.out.println(alphabet.get("letter"));

        return alphabet.get(letter);
    }
    
    public int func3() {
    // Set demonstration using HashSet 
        System.out.println("Set demonstration using HashSet");
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Moto Guzzi");
        hash_Set.add("Honda");
        hash_Set.add("Ducati");
        hash_Set.add("Triumph");
        
        // Sorted Set
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.print(hash_Set.size());
        
        return hash_Set.size();
    }
        
}
