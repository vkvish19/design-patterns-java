package com.github.vkvish19.designpatterns.behavioural.iterator_pattern.problem;

public class Book
{
    private String title;

    public Book(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
