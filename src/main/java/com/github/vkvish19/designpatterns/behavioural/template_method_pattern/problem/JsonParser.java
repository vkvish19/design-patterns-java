package com.github.vkvish19.designpatterns.behavioural.template_method_pattern.problem;

public class JsonParser
{
    public void parse()
    {
        openFile();
        //json specific parsing logic
        System.out.println("parsing json file");
        closeFile();
    }

    private void openFile()
    {
        System.out.println("opening json file");
    }

    private void closeFile()
    {
        System.out.println("Closing json file");
    }
}
