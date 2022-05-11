package edu.junit.ex02.task2.task2_VI.controller;

import edu.junit.ex02.task2.task2_VI.model.Author;
import edu.junit.ex02.task2.task2_VI.model.Book;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookAction {

    public static Map<Author, Long> getBookCount(List<Book> books) {
        return books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
    }
}
