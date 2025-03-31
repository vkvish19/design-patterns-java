package com.github.vkvish19.designpatterns.structural.composite_pattern.problem;

import java.util.ArrayList;
import java.util.List;

public class Folder
{
    private final String name;
    private final List<File> files = new ArrayList<>();

    public Folder(String name)
    {
        this.name = name;
    }

    public void addFile(File file)
    {
        files.add(file);
    }

    public void showDetails()
    {
        System.out.println("Folder: " + name);
        for(File file : files)
        {
            file.showDetails();
        }
    }
}
