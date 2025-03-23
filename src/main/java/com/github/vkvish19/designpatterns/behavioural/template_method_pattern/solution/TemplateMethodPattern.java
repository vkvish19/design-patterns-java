package com.github.vkvish19.designpatterns.behavioural.template_method_pattern.solution;

/**
 *  Template Method Pattern
 *  Problem: Different parts of an alorithm may need to vary in subclasses, but the overall structure should remain consistent.
 *  Solution: The Template Method Pattern defines the Skeleton of an algorithm in a base class and lets subclasses override specific dates.
 *  </p>
 *
 *  Structure:
 *      -> Abstract class: defines the algorithm skeleton.
 *      -> Concrete subclasses: override specific steps of the algorithm.
 */
public class TemplateMethodPattern
{
    public static void main(String[] args)
    {
        FileParser csvFileParser = new CSVParser();
        FileParser jsonFileParser = new JsonParser();

        csvFileParser.parseFile();
        jsonFileParser.parseFile();
    }
}
