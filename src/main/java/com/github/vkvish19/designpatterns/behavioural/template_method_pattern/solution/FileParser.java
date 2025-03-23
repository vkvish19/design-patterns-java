package com.github.vkvish19.designpatterns.behavioural.template_method_pattern.solution;

public abstract class FileParser
{
    // Template method: define the steps in the algorithm
    public final void parseFile()
    {
        openFile();
        parse();
        closeFile();
    }

    protected void openFile()
    {
        System.out.println("Opening file in template");
    }

    protected void closeFile()
    {
        System.out.println("Closing file in template");
    }

    protected abstract void parse();
}
