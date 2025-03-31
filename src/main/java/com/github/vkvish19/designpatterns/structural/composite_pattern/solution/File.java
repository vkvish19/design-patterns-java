package com.github.vkvish19.designpatterns.structural.composite_pattern.solution;

public class File implements FileSystemComponent
{
    private final String name;

    public File(String name)
    {
        this.name = name;
    }

    @Override
    public void showDetails()
    {
        System.out.println("File: " + name);
    }
}
