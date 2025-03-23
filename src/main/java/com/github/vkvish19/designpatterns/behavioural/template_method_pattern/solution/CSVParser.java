package com.github.vkvish19.designpatterns.behavioural.template_method_pattern.solution;

public class CSVParser extends  FileParser
{
    @Override
    protected void parse()
    {
        System.out.println("Parsing CSV file.");
    }
}
