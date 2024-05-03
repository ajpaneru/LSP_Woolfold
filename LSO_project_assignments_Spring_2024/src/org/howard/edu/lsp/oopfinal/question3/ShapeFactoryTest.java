package org.howard.edu.lsp.oopfinal.question3;

//ShapeFactoryTest.java
//JUnit tests for the ShapeFactory class.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
 private ShapeFactory factory = new ShapeFactory(); // Instance of ShapeFactory to use in tests

 @Test
 void testCreateCircle() {
     Shape shape = factory.getShape("CIRCLE"); // Request a Circle
     assertNotNull(shape, "Circle should not be null"); // Test should pass if shape is not null
     assertTrue(shape instanceof Circle, "Shape should be an instance of Circle"); // Check if the correct object type was returned
 }

 @Test
 void testCreateRectangle() {
     Shape shape = factory.getShape("RECTANGLE"); // Request a Rectangle
     assertNotNull(shape, "Rectangle should not be null"); // Test should pass if shape is not null
     assertTrue(shape instanceof Rectangle, "Shape should be an instance of Rectangle"); // Check if the correct object type was returned
 }
}