package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FilmManagerTest {
    Film one = new Film(1, "Bloodshot", "action");
    Film two = new Film(2, "Forward", "cartoon");
    Film three = new Film(3, "Hotel Belgrad", "comedy");
    Film four = new Film(4, "Gentlmens", "action");
    Film five = new Film(5, "Invisibleman", "thriller");
    Film six = new Film(6, "Throlls", "cartoon");
    Film seven = new Film(7, "Home alone", "comedy");
    Film eight = new Film(8, "Last of the Mohicans", "action");
    Film nine = new Film(9, "Terminator 2", "action");

    @Test
    void showAllMovies() {
        FilmManager filmManager = new FilmManager();
        filmManager.add(one);
        filmManager.add(two);
        filmManager.add(three);
        filmManager.add(four);
        filmManager.add(five);
        filmManager.add(six);
        filmManager.add(seven);
        filmManager.add(eight);
        filmManager.add(nine);
        Film[] actual = filmManager.getAll(filmManager.movies);
        Film[] expected = new Film[]{nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addFilm() {
        FilmManager filmManager = new FilmManager();
        Film ten = new Film(10, "Meet the parents", "comedy");

        filmManager.add(one);
        filmManager.add(two);
        filmManager.add(three);
        filmManager.add(four);
        filmManager.add(five);
        filmManager.add(six);
        filmManager.add(seven);
        filmManager.add(eight);
        filmManager.add(nine);

        Film[] actual = filmManager.add(ten);
        Film[] expected = new Film[]{one, two, three, four, five, six, seven, eight, nine, ten};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showFilmsWithoutLimit() {
        FilmManager filmManager = new FilmManager();
        Film ten = new Film(10, "Meet the parents", "comedy");

        filmManager.add(one);
        filmManager.add(two);
        filmManager.add(three);
        filmManager.add(four);
        filmManager.add(five);
        filmManager.add(six);
        filmManager.add(seven);
        filmManager.add(eight);
        filmManager.add(nine);
        filmManager.add(ten);

        Film[] actual = filmManager.showNewMovies();
        Film[] expected = new Film[]{ten, nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void showAddedFilmsWithLimit() {
        FilmManager filmManager = new FilmManager(5);

        Film ten = new Film(10, "Meet the parents", "comedy");

        filmManager.add(one);
        filmManager.add(two);
        filmManager.add(three);
        filmManager.add(four);
        filmManager.add(five);
        filmManager.add(six);
        filmManager.add(seven);
        filmManager.add(eight);
        filmManager.add(nine);
        filmManager.add(ten);

        Film[] actual = filmManager.showNewMovies();
        Film[] expected = new Film[]{ten, nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }


}





