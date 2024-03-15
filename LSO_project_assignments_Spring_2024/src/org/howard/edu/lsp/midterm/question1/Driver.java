package org.howard.edu.lsp.midterm.question1;

public class Driver {
    public static void main(String[] args) {
        String originalText = "I love CSCI363";
        String encrypted = SecurityOps.encrypt(originalText);
        System.out.println("Original: " + originalText);
        System.out.println("Encrypted: " + encrypted);
        
        originalText = "This is CSstudent026";
        encrypted = SecurityOps.encrypt(originalText);
        System.out.println("Original: " + originalText);
        System.out.println("Encrypted: " + encrypted);
    }
}