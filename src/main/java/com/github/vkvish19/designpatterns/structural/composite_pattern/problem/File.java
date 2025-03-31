package com.github.vkvish19.designpatterns.structural.composite_pattern.problem;

public class File
{
    private final String name;

    public File(String name)
    {
        this.name = name;
    }

    public void showDetails()
    {
        System.out.println("File: " + name);
    }
}
