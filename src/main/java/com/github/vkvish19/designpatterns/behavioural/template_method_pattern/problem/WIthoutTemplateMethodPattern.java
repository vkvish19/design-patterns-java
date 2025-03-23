package com.github.vkvish19.designpatterns.behavioural.template_method_pattern.problem;

public class WIthoutTemplateMethodPattern
{
    public static void main(String[] args)
    {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
        JsonParser jsonParser = new JsonParser();
        jsonParser.parse();

        // while this works, but the openFile(), closeFile() is common/duplicate
        // and there is chance of missing out on some code when duplicating the code.
    }
}
