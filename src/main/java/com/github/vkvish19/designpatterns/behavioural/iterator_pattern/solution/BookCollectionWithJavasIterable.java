package com.github.vkvish19.designpatterns.behavioural.iterator_pattern.solution;

import java.util.*;
import java.util.Iterator;

public class BookCollectionWithJavasIterable implements Iterable<Book>
{
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book)
    {
        books.add(book);
    }

    public Set<Book> getBooks()
    {
        return books;
    }

    @Override
    public Iterator<Book> iterator()
    {
        return books.iterator();
    }
}
