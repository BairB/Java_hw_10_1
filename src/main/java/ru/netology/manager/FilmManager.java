package ru.netology.manager;

import lombok.AllArgsConstructor;
import ru.netology.domain.Film;

//@AllArgsConstructor

public class FilmManager {

    public Film[] movies = new Film[0];

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

    public Film[] getAll(Film[] movies) {
        Film[] result = new Film[movies.length];
        for (int i = 0; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    private int limit = 10;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {

    }

    public Film[] showNewMovies() {
        int count = limit;
        if (movies.length <= limit) {
            count = movies.length;
        }
        Film[] result = new Film[count];
        for (int i = 0; i < count; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }
}





