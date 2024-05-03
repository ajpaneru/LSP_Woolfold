package org.howard.edu.lsp.oopfinal.question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    void testAddSong() {
        db.addSong("Rap", "Gin and Juice");
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"), "Song should be added to the Rap genre");
    }

    @Test
    void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"), "Expected genre is Rap");
        assertNull(db.getGenreOfSong("Nonexistent Song"), "Expected null for an unlisted song");
    }

    @Test
    void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"), "Rap songs should include 'Savage'");
        assertEquals(1, rapSongs.size(), "There should be exactly one song in the Rap genre");
    }
}
