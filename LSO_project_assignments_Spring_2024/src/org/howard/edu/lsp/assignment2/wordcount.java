package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class wordcount {
    
    public static void main(String[] args) {
        // Relative path to the input file
        String inputFile = "words.txt";
        
        // Read the file and count the words
        Map<String, Integer> wordCounts = countWords(inputFile);
        
        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
    
    public static Map<String, Integer> countWords(String inputFile) {
        Map<String, Integer> wordCounts = new HashMap<>();
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words by whitespace
                for (String word : words) {
                    word = word.toLowerCase(); // Convert word to lowercase
                    word = word.replaceAll("[^a-zA-Z']", ""); // Remove non-letter characters except apostrophe
                    if (word.length() > 0 && word.length() > 3) { // Exclude trivial words
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return wordCounts;
    }
}
