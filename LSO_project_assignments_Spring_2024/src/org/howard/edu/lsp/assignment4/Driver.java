package org.howard.edu.lsp.assignment4;

public class Driver {
    public static void main(String[] args) {
        // Creating two IntegerSet instances for demonstration
        IntegerSet firstSet = new IntegerSet();
        IntegerSet secondSet = new IntegerSet();
        
        // Populating firstSet with some integers
        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        System.out.println("Initial state of firstSet: " + firstSet);
        
        // Populating secondSet with some integers
        secondSet.add(20);
        secondSet.add(30);
        secondSet.add(40);
        System.out.println("Initial state of secondSet: " + secondSet);
        
        // Demonstrating union functionality
        firstSet.union(secondSet);
        System.out.println("firstSet after union with secondSet: " + firstSet);
        
        // Resetting firstSet to original values for next operation
        firstSet.clear();
        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        
        // Demonstrating intersection functionality
        firstSet.intersect(secondSet);
        System.out.println("firstSet after intersection with secondSet: " + firstSet);
        
        // Resetting firstSet for difference demonstration
        firstSet.clear();
        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);
        
        // Demonstrating difference functionality
        firstSet.diff(secondSet);
        System.out.println("firstSet after difference from secondSet: " + firstSet);
        
        // Checking for specific elements
        boolean contains = firstSet.contains(10);
        System.out.println("Does firstSet contain 10? " + contains);
        
        // Testing for the largest and smallest elements
        try {
            System.out.println("Largest element in secondSet: " + secondSet.largest());
            System.out.println("Smallest element in secondSet: " + secondSet.smallest());
        } catch (IntegerSetException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
        
        // Verifying the isEmpty method
        firstSet.clear();
        System.out.println("Is firstSet empty? " + firstSet.isEmpty());
        
        // Attempting to find the largest element in an empty set
        try {
            firstSet.largest();
        } catch (IntegerSetException e) {
            System.err.println("Attempted to find largest in empty set: " + e.getMessage());
        }
    }
}