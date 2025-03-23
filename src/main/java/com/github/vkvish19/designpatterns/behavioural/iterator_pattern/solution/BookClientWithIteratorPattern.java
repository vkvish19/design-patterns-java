package com.github.vkvish19.designpatterns.behavioural.iterator_pattern.solution;

import java.util.Iterator;

/**
 *  Iterator Pattern:-
 *      Problem: how to access elements in a collection without exposing its internal representation.
 *      Solution: the iterator pattern provides a way to traverse a collection without revealing
 *          its underlying structure, offering a uniform interface for traversal.
 *  <p>
 *  Structure:-
 *      Iterator: Interface for traversing a collection.
 *      Collection: Holds the elements and provides an iterator.
 *  <p>
 *
 *  Benefits:-
 *      Separation of Concerns: the traversal logic is separated from the collection itself, allowing
 *          you to change one without affecting the other.
 *      Uniform Interface: the same interface (Iterator) is used to traverse different types of collections,
 *          making the code more flexible.
 *      Simplified Client Code: the client doesn't need to know the underlying data structure, reducing
 *          coupling and making the code easier to maintain.
 *      Multiple Traversal Strategies: you can implement multiple types of iterators
 *          (e.g., forward, backward, filtered) without changing the collection.
 */
public class BookClientWithIteratorPattern
{
    public static void main(String[] args)
    {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("English"));
        bookCollection.addBook(new Book("Maths"));
        bookCollection.addBook(new Book("Science"));

        Iterator<Book> bookIterator = bookCollection.createIterator();
        while(bookIterator.hasNext())
        {
            Book book = bookIterator.next();
            System.out.println(book);
        }
    }
}
