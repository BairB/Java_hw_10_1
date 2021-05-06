package ru.netology.domain;


import java.nio.file.FileStore;

public class FilmManager {
    Films[] movies = {
            new Films(1, "Bloodshot", "action"),
            new Films(2, "Forward", "cartoon"),
            new Films(3, "Hotel Belgrad", "comedy"),
            new Films(4, "Gentlmens", "action"),
            new Films(5, "Invisibleman", "thriller"),
            new Films(6, "Throlls", "cartoon"),
            new Films(7, "Home alone", "comedy"),
            new Films(8, "Last of the Mohicans", "action"),
            new Films(9, "Terminator 2", "action")
    };

    Films movie = new Films(10, "Meet the parents", "comedy");
    private int howManyFilmsShouldToShow = 5;

    public Films[] add(Films movie) {
        int length = movies.length + 1;
        Films[] tmp = new Films[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
        return tmp;
    }

    public Films[] getAll() {
        Films[] result = new Films[movies.length];
        for (int i = 0; i < movies.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Films[] showAddedFilms() {
        for (int i = movies.length - 1; i > movies.length - howManyFilmsShouldToShow - 1; i--) {
            System.out.println(movies[i]);
        }
        return new Films[0];
    }
}
