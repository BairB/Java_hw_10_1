package ru.netology.manager;


import ru.netology.domain.Film;

import java.util.Arrays;

public class FilmManager {
    public Film[] movies = new Film[0];
    private int howManyFilmsShouldToShow = 5;

    public Film[] add(Film movie) {
        int length = movies.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
        return tmp;
    }

    public Film[] getAll() {
        Film[] result = new Film[movies.length];
        for (int i = 0; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Film[] showAddedFilms() {
        for (int i = movies.length - 1; i > movies.length - howManyFilmsShouldToShow - 1; i--) {
        }
        return new Film[0];
    }
}
