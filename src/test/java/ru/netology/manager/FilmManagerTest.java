package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

class FilmManagerTest {
    FilmManager filmManager = new FilmManager();
    Film[] movies = {
            new Film(1, "Bloodshot", "action"),
            new Film(2, "Forward", "cartoon"),
            new Film(3, "Hotel Belgrad", "comedy"),
            new Film(4, "Gentlmens", "action"),
            new Film(5, "Invisibleman", "thriller"),
            new Film(6, "Throlls", "cartoon"),
            new Film(7, "Home alone", "comedy"),
            new Film(8, "Last of the Mohicans", "action"),
            new Film(9, "Terminator 2", "action")
    };

    Film movie = new Film(10, "Meet the parents", "comedy");

    @Test
    void addFilm() {
        Film[] actual = filmManager.add(movie);
        Film[] expected = {
                new Film(1, "Bloodshot", "action"),
                new Film(2, "Forward", "cartoon"),
                new Film(3, "Hotel Belgrad", "comedy"),
                new Film(4, "Gentlmens", "action"),
                new Film(5, "Invisibleman", "thriller"),
                new Film(6, "Throlls", "cartoon"),
                new Film(7, "Home alone", "comedy"),
                new Film(8, "Last of the Mohicans", "action"),
                new Film(9, "Terminator 2", "action"),
                new Film(10, "Meet the parents", "comedy")
        };
    }

    @Test
    void showAddedFilms() {
        filmManager.add(movie);
        Film[] actual = filmManager.showAddedFilms();
        Film[] expected = {
                new Film(6, "Throlls", "cartoon"),
                new Film(7, "Home alone", "comedy"),
                new Film(8, "Last of the Mohicans", "action"),
                new Film(9, "Terminator 2", "action"),
                new Film(10, "Meet the parents", "comedy")
        };

    }

    @Test
    void showAllFilms() {
        filmManager.getAll();
        Film[] actual = filmManager.getAll();
        Film[] expected = {
                new Film(1, "Bloodshot", "action"),
                new Film(2, "Forward", "cartoon"),
                new Film(3, "Hotel Belgrad", "comedy"),
                new Film(4, "Gentlmens", "action"),
                new Film(5, "Invisibleman", "thriller"),
                new Film(6, "Throlls", "cartoon"),
                new Film(7, "Home alone", "comedy"),
                new Film(8, "Last of the Mohicans", "action"),
                new Film(9, "Terminator 2", "action"),
                new Film(10, "Meet the parents", "comedy")
        };
    }
}