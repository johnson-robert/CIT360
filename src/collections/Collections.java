/*
 * To change thismotorcyclesicense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *https://docs.oracle.com/javase/tutorial/collections/index.html
 *http://www.tutorialspoint.com/java/java_collections.htm
 *show one expamle of each type
 */
package collections;

/**
 * @Rob Johnson
 *
 * Java collections each have different interfaces, each of which has its own
 * structure for storing data. Five of these are List , Set, Map, Queue and
 * Tree.
 */
import java.util.*;

public class Collections {

    public static void main(String[] args) {

        // List Example using ArrayList
        System.out.println("List Example");
        List<String> motorcycles = new ArrayList<String>();
        motorcycles.add("Ducati");
        motorcycles.add("Honda");
        motorcycles.add("Moto Guzzi");
        motorcycles.add("Triumph");

        //display motorcycles
        System.out.println(motorcycles);

        //remove a motorcycle
        motorcycles.remove("Triumph");

        //display motorcycles
        System.out.println(motorcycles);

        //display index of Ducati
        System.out.println("Index of Ducati: "
                + motorcycles.indexOf("Ducati"));
        System.out.println("\n");

        // Set demonstration using HashSet 
        System.out.println("Set demonstration using HashSet");
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Moto Guzzi");
        hash_Set.add("Honda");
        hash_Set.add("Ducati");
        hash_Set.add("Triumph");

        //Size of hashSet
        System.out.print("There are currently "
                + (motorcycles.size() + 1) + " Motorcycles");

        //Set unsorted
        System.out.print("Unsorted Set ");
        System.out.println(hash_Set);

        // Sorted Set
        System.out.print("Sorted Set ");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
        System.out.println("\n");

        //Map
        System.out.println("Maping the Alphabet");
        Map< String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", new Integer(1));
        alphabet.put("b", new Integer(2));
        alphabet.put("c", new Integer(3));
        alphabet.put("y", new Integer(25));
        alphabet.put("z", new Integer(26));

        //Alphabet Size
        System.out.println("Alphabet Size: " + alphabet.size());

        //Print Alphabet
        System.out.println("alphabet is " + alphabet);
        System.out.println("\n");

        // the queue
        System.out.println("Creating a Queue");
        Queue<String> queueable = new LinkedList<>();

        // Add elements
        queueable.add("Bob");
        queueable.add("Dick");
        queueable.add("Joe");
        queueable.add("Harry");
        queueable.add("Sally");

        // Display contents of thequeueableueue. 
        System.out.println("Get in line " + queueable);

        //remove first element
        System.out.println("Wait " + queueable.remove()
                + " is no longer here.");
        System.out.println("Now there's only " + queueable.size()
                + " of you left.");
        System.out.println("Here's the new line" + queueable);
    }
}
//        Trees are good for storing information that have a natural hierarchy
//        where the data doesn't necessaily make sense in the structure.
//        Trees are generally have slow performance, but have no limit to the 
//        number of nodes and well suited for certain types of data.
//        Sand 

class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
}

// A Java program to introduce Binary Tree 
class BinaryTree 
{ 
    // Root of Binary Tree 
    Node root; 
  
    // Constructors 
    BinaryTree(int key) 
    { 
        root = new Node(key); 
    } 
  
    BinaryTree() 
    { 
        root = null; 
    } 
  
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
  
        //create root
        tree.root = new Node(1); 
        
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
    } 
}

 