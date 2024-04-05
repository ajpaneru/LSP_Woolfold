package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerSetTest {

    private IntegerSet testSet;
    private IntegerSet compareSet;

    @BeforeEach
    void setUp() {
        testSet = new IntegerSet();
        compareSet = new IntegerSet();
    }

    @Test
    @DisplayName("Test Clear method clears the set")
    void testClear() {
        testSet.add(1);
        testSet.clear();
        assertTrue(testSet.isEmpty(), "Set should be empty after clear is called.");
    }

    @Test
    @DisplayName("Test Length method returns correct length")
    void testLength() {
        assertEquals(0, testSet.length(), "Newly created set should have length 0.");
        testSet.add(1);
        assertEquals(1, testSet.length(), "Set with one element should have length 1.");
    }

    @Test
    @DisplayName("Test Equals method for equal sets")
    void testEquals() {
        testSet.add(1);
        compareSet.add(1);
        assertTrue(testSet.equals(compareSet), "Sets with the same elements should be equal.");
    }

    @Test
    @DisplayName("Test Contains method for existing and non-existing elements")
    void testContains() {
        testSet.add(1);
        assertTrue(testSet.contains(1), "Set should contain the element 1.");
        assertFalse(testSet.contains(2), "Set should not contain the element 2.");
    }

    @Test
    @DisplayName("Test Largest method returns the largest element")
    void testLargest() throws IntegerSetException {
        testSet.add(1);
        testSet.add(3);
        assertEquals(3, testSet.largest(), "The largest element should be 3.");
    }

    @Test
    @DisplayName("Test Smallest method returns the smallest element")
    void testSmallest() throws IntegerSetException {
        testSet.add(1);
        testSet.add(3);
        assertEquals(1, testSet.smallest(), "The smallest element should be 1.");
    }

    @Test
    @DisplayName("Test Add method adds unique elements only")
    void testAdd() {
        testSet.add(1);
        testSet.add(1);
        assertEquals(1, testSet.length(), "Set should not add duplicate elements.");
    }

    @Test
    @DisplayName("Test Remove method removes elements")
    void testRemove() {
        testSet.add(1);
        testSet.remove(1);
        assertFalse(testSet.contains(1), "Set should not contain the element after removal.");
    }

    @Test
    @DisplayName("Test Union method combines sets")
    void testUnion() {
        testSet.add(1);
        compareSet.add(2);
        testSet.union(compareSet);
        assertTrue(testSet.contains(1) && testSet.contains(2), "Union set should contain elements from both sets.");
    }

    @Test
    @DisplayName("Test Intersect method finds common elements")
    void testIntersect() {
        testSet.add(1);
        testSet.add(2);
        compareSet.add(2);
        testSet.intersect(compareSet);
        assertTrue(testSet.contains(2) && testSet.length() == 1, "Intersect should only contain common elements.");
    }

    @Test
    @DisplayName("Test Diff method finds differences between sets")
    void testDiff() {
        testSet.add(1);
        testSet.add(2);
        compareSet.add(2);
        testSet.diff(compareSet);
        assertTrue(testSet.contains(1) && !testSet.contains(2), "Diff should contain elements unique to the first set.");
    }

    @Test
    @DisplayName("Test IsEmpty method checks if set is empty")
    void testIsEmpty() {
        assertTrue(testSet.isEmpty(), "Newly created set should be empty.");
    }

    @Test
    @DisplayName("Test ToString method provides set representation")
    void testToString() {
        testSet.add(1);
        assertEquals("[1]", testSet.toString(), "ToString should accurately represent the set.");
    }

    @Test
    @DisplayName("Test Largest throws exception for empty set")
    void testLargestException() {
        assertThrows(IntegerSetException.class, () -> testSet.largest(), "Largest should throw IntegerSetException on empty set.");
    }

    @Test
    @DisplayName("Test Smallest throws exception for empty set")
    void testSmallestException() {
        assertThrows(IntegerSetException.class, () -> testSet.smallest(), "Smallest should throw IntegerSetException on empty set.");
    }
}
