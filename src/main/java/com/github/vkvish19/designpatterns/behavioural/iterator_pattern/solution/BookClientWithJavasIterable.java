package com.github.vkvish19.designpatterns.behavioural.iterator_pattern.solution;

import java.util.Iterator;

public class BookClientWithJavasIterable
{
    public static void main(String[] args)
    {
        BookCollectionWithJavasIterable bookCollection = new BookCollectionWithJavasIterable();
        bookCollection.addBook(new Book("English"));
        bookCollection.addBook(new Book("Maths"));
        bookCollection.addBook(new Book("Science"));

        Iterator<Book> bookIterator = bookCollection.iterator(); // standardized
        while(bookIterator.hasNext())
        {
            Book book = bookIterator.next();
            System.out.println(book);
        }
    }
}
