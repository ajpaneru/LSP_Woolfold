package org.howard.edu.lsp.assignment4;

public class Driver {
    public static void main(String[] args) {
        // Initialize two sets
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        // Adding elements to set1
        set1.add(1);
        set1.add(3);
        set1.add(5);
        System.out.println("Set1 initial elements: " + set1.toString());
        
        // Adding elements to set2
        set2.add(2);
        set2.add(3);
        set2.add(6);
        System.out.println("Set2 initial elements: " + set2.toString());
        
        // Performing union operation
        set1.union(set2);
        System.out.println("Set1 after union with Set2: " + set1.toString());
        
        // Reset and reinitialize set1
        set1.clear();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        
        // Performing intersection operation
        set1.intersect(set2);
        System.out.println("Set1 after intersect with Set2: " + set1.toString());
        
        // Reset and reinitialize set1
        set1.clear();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        
        // Performing difference operation
        set1.diff(set2);
        System.out.println("Set1 after difference with Set2: " + set1.toString());
        
        // Demonstrating other IntegerSet functionalities
        set1.clear();
        set1.add(4);
        set1.add(7);
        set1.add(8);
        System.out.println("Reinitialized Set1: " + set1.toString());
        
        // Testing contains method
        System.out.println("Set1 contains 4: " + set1.contains(4));
        System.out.println("Set1 contains 2: " + set1.contains(2));
        
        // Testing largest and smallest methods
        try {
            System.out.println("Largest element in Set1: " + set1.largest());
            System.out.println("Smallest element in Set1: " + set1.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }
        
        // Testing isEmpty method
        set1.clear();
        System.out.println("Set1 is empty after clear: " + set1.isEmpty());
        
        // Try to get the largest element of an empty set
        try {
            set1.largest();
        } catch (IntegerSetException e) {
            System.out.println("Error trying to get the largest element of an empty set: " + e.getMessage());
        }
    }
}