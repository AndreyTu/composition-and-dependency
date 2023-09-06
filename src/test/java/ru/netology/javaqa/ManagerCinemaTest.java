package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerCinemaTest {

    @Test
    public void testAllMovies() {
        ManagerCinema manager = new ManagerCinema();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMovies() {
        ManagerCinema manager = new ManagerCinema();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMoviesOverSize() {
        ManagerCinema manager = new ManagerCinema(5);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMoviesLimitSize() {
        ManagerCinema manager = new ManagerCinema(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель 'Белград'";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMoviesLessLimitSize() {
        ManagerCinema manager = new ManagerCinema(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMoviesOverLimitSize() {
        ManagerCinema manager = new ManagerCinema(3);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Отель 'Белград'";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-невидимка";
        String movie6 = "Тролли. Мировой тур";
        String movie7 = "Номер один";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }
}