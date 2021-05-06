package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    FilmManager filmManager = new FilmManager();
    Films movies = new Films(10, "Meet the parents", "comedy");

    @Test
    void addFilm(){
        Films[] actual = filmManager.add(movies);
        Films[] expected = {
                new Films(1, "Bloodshot", "action"),
                new Films(2, "Forward", "cartoon"),
                new Films(3, "Hotel Belgrad", "comedy"),
                new Films(4, "Gentlmens", "action"),
                new Films(5, "Invisibleman", "thriller"),
                new Films(6, "Throlls", "cartoon"),
                new Films(7, "Home alone", "comedy"),
                new Films(8, "Last of the Mohicans", "action"),
                new Films(9, "Terminator 2", "action"),
                new Films(10, "Meet the parents", "comedy")
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void showAddedFilms(){
        filmManager.add(movies);
        Films[] actual = filmManager.showAddedFilms();
        Films[] expected = {
                new Films(6, "Throlls", "cartoon"),
                new Films(7, "Home alone", "comedy"),
                new Films(8, "Last of the Mohicans", "action"),
                new Films(9, "Terminator 2", "action"),
                new Films(10, "Meet the parents", "comedy")
        };

    }

    @Test
    void showAllFilms(){
        filmManager.getAll();
        Films[] actual = filmManager.getAll();
        Films[] expected = {
                new Films(1, "Bloodshot", "action"),
                new Films(2, "Forward", "cartoon"),
                new Films(3, "Hotel Belgrad", "comedy"),
                new Films(4, "Gentlmens", "action"),
                new Films(5, "Invisibleman", "thriller"),
                new Films(6, "Throlls", "cartoon"),
                new Films(7, "Home alone", "comedy"),
                new Films(8, "Last of the Mohicans", "action"),
                new Films(9, "Terminator 2", "action"),
                new Films(10, "Meet the parents", "comedy")
        };
    }
}