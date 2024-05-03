package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    // Map to hold the genres and corresponding sets of songs.
    private Map<String, Set<String>> genreToSongsMap;

    // Constructor to initialize the map.
    public SongsDatabase() {
        genreToSongsMap = new HashMap<>();
    }

    /**
     * Adds a song title under a specific genre. If the genre does not already exist,
     * it initializes a new set for that genre.
     * @param genre The genre of the song.
     * @param songTitle The title of the song.
     */
    public void addSong(String genre, String songTitle) {
        // Check if the genre already exists, if not, initialize a new HashSet.
        genreToSongsMap.computeIfAbsent(genre, k -> new HashSet<>()).add(songTitle);
    }

    /**
     * Retrieves the genre of a particular song title.
     * @param songTitle The title of the song.
     * @return The genre of the song if found, otherwise returns null.
     */
    public String getGenreOfSong(String songTitle) {
        for (Map.Entry<String, Set<String>> entry : genreToSongsMap.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        // Return null if no genre is found for the song title.
        return null;
    }

    /**
     * Retrieves all songs associated with a particular genre.
     * @param genre The genre for which songs are to be retrieved.
     * @return A set of songs for the specified genre, or an empty set if none are found.
     */
    public Set<String> getSongs(String genre) {
        return genreToSongsMap.getOrDefault(genre, new HashSet<>());
    }
}