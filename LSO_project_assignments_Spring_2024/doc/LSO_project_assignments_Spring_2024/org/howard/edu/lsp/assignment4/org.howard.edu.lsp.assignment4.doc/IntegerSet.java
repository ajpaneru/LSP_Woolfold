package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a set of unique integers and supports basic set operations.
 */
public class IntegerSet {
    private List<Integer> elements;

    public IntegerSet() {
        this.elements = new ArrayList<>();
    }

    public IntegerSet(List<Integer> initialElements) {
        this.elements = new ArrayList<>();
        for (int element : initialElements) {
            this.add(element);
        }
    }

    /** Clears all elements from the set. */
    public void clear() {
        elements.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return the length of the set
     */
    public int length() {
        return elements.size();
    }

    /**
     * Compares the current set with another object for equality.
     * @param obj the object to be compared for equality with the current set
     * @return true if the specified object is equal to the current set, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) obj;
        return elements.size() == other.elements.size() && elements.containsAll(other.elements);
    }

    /**
     * Determines whether the set contains a specific integer value.
     * @param value the integer value to search for in the set
     * @return true if the set contains the specified value, false otherwise
     */
    public boolean contains(int value) {
        return elements.contains(value);
    }

    /**
     * Adds a unique item to the set.
     * @param item the integer item to be added to the set
     */
    public void add(int item) {
        if (!contains(item)) {
            elements.add(item);
        }
    }

    /**
     * Removes an item from the set.
     * @param item the integer item to be removed from the set
     */
    public void remove(int item) {
        elements.remove(Integer.valueOf(item));
    }

    /**
     * Retrieves the largest item in the set.
     * @return the largest integer in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (elements.isEmpty()) throw new IntegerSetException("Set is empty.");
        return elements.stream().max(Integer::compare).get();
    }

    /**
     * Retrieves the smallest item in the set.
     * @return the smallest integer in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (elements.isEmpty()) throw new IntegerSetException("Set is empty.");
        return elements.stream().min(Integer::compare).get();
    }

    /**
     * Performs the union operation on this set with another set.
     * @param anotherSet the other IntegerSet to perform the union with.
     */
    public void union(IntegerSet anotherSet) {
        for (Integer element : anotherSet.elements) {
            this.add(element);
        }
    }

    /**
     * Retains only the elements in this set that are contained in the specified set.
     * @param anotherSet the IntegerSet to intersect with.
     */
    public void intersect(IntegerSet anotherSet) {
        elements.retainAll(anotherSet.elements);
    }

    /**
     * Removes the elements in the specified set from this set.
     * @param anotherSet the IntegerSet to compare with for the difference.
     */
    public void diff(IntegerSet anotherSet) {
        elements.removeAll(anotherSet.elements);
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Provides a String representation of the set.
     * @return a String representation of the set
     */
    @Override
    public String toString() {
        return elements.toString();
    }
}

/**
 * Custom exception class for IntegerSet operations.
 */
class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}