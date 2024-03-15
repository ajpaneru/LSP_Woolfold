package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    public static String encrypt(String text) {
        // Keep the method signature as is.
        StringBuilder cleanText = new StringBuilder();
        StringBuilder result = new StringBuilder();

        // Filtering non-alphanumeric characters using StringBuilder for efficiency
        for (char ch : text.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanText.append(ch);
            }
        }

        // Constructing encrypted text by appending characters at even indices first
        for (int i = 0; i < cleanText.length(); i += 2) {
            result.append(cleanText.charAt(i));
        }

        // Appending characters at odd indices
        for (int i = 1; i < cleanText.length(); i += 2) {
            result.append(cleanText.charAt(i));
        }

        // Return the encrypted string
        return result.toString();
    }
}