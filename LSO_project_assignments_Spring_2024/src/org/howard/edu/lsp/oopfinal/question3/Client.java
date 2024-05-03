package org.howard.edu.lsp.oopfinal.question3;

//Client.java
//Main class that uses the ShapeFactory to create and draw shapes.
public class Client {
 public static void main(String[] args) {
     ShapeFactory shapeFactory = new ShapeFactory(); // Create a ShapeFactory object

     // Create and draw a Circle
     Shape circle = shapeFactory.getShape("CIRCLE");
     if (circle != null) circle.draw(); // Ensure the shape is not null before drawing

     // Create and draw a Rectangle
     Shape rectangle = shapeFactory.getShape("RECTANGLE");
     if (rectangle != null) rectangle.draw(); // Ensure the shape is not null before drawing
 }
}