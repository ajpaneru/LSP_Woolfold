package org.howard.edu.lsp.oopfinal.question3;

//ShapeFactory.java
//Factory class for creating instances of shapes.
public class ShapeFactory {

 // Method to get an instance of a shape based on the type specified.
 public Shape getShape(String shapeType) {
     if (shapeType == null) {
         return null; // Return null if no type is provided
     }
     switch (shapeType.toUpperCase()) { // Case insensitive check of the shape type
         case "CIRCLE":
             return new Circle(); // Return a new instance of Circle
         case "RECTANGLE":
             return new Rectangle(); // Return a new instance of Rectangle
         default:
             return null; // Return null if the shape type is unrecognized
     }
 }
}