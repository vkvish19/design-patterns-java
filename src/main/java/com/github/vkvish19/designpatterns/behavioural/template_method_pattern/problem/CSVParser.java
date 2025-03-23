package com.github.vkvish19.designpatterns.behavioural.template_method_pattern.problem;

public class CSVParser
{
    public void parse()
    {
        openFile();
        //csv specific parsing logic
        System.out.println("parsing csv file");
        closeFile();
    }

    private void openFile()
    {
        System.out.println("opening csv file");
    }

    private void closeFile()
    {
        System.out.println("Closing csv file");
    }
}
