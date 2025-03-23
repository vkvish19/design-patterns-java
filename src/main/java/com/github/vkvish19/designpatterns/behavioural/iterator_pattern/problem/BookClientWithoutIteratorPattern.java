package com.github.vkvish19.designpatterns.behavioural.iterator_pattern.problem;

public class BookClientWithoutIteratorPattern
{
    public static void main(String[] args)
    {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Head First Java"));
        bookCollection.addBook(new Book("C++ Book"));
        bookCollection.addBook(new Book("Golang book"));

        for(int i=0; i<bookCollection.getBooks().size(); i++)
        {
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
