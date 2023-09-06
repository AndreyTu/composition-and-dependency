package ru.netology.javaqa;

public class ManagerCinema {
    private String[] movies = new String[0];
    private int limit = 7;

    public ManagerCinema(int limit) {
        this.limit = limit;
    }

    public ManagerCinema() {
    }

    public void add(String newMovies) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovies;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

}
