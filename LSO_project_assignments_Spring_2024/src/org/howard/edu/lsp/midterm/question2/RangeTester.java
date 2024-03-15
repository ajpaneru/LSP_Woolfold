package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

	public static void main(String[] args) {
	    // Instantiate IntegerRange objects to represent various ranges
	    IntegerRange rangeA = new IntegerRange(5, 10);
	    IntegerRange rangeB = new IntegerRange(8, 12);
	    IntegerRange rangeC = new IntegerRange(2, 4);

	    // Testing the contains method
	    System.out.println("Range A contains 7: " + rangeA.contains(7)); // Expected: true
	    System.out.println("Range B contains 15: " + rangeB.contains(15)); // Expected: false

	    // Testing the overlaps method
	    System.out.println("Range A and Range B have common elements: " + rangeA.overlaps(rangeB)); // Expected: true
	    System.out.println("Range A and Range C have common elements: " + rangeA.overlaps(rangeC)); // Expected: false

	    // Checking the size of the ranges
	    System.out.println("Total elements in Range A: " + rangeA.size()); // Expected: 6

	    // Testing equality between range instances
	    IntegerRange copyOfRangeA = new IntegerRange(5, 10);
	    System.out.println("Range A is identical to its copy: " + rangeA.equals(copyOfRangeA)); // Expected: true
	    System.out.println("Range A is identical to Range B: " + rangeA.equals(rangeB)); // Expected: false
	}