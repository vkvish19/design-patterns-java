package com.github.vkvish19.designpatterns.creational.builder_pattern.problem;

public class WithoutBuilderPattern
{
    public static void main(String[] args)
    {
        House house1 = new House("shingles", "concrete", "wood", false, false, true);
        // House house2 = new House("shingles", "concrete", "wood", false);
        // Constructor explosion --> too many constructors (if we think of covering all possibilities)
        // Difficult to understand and maintain the code.
        // In such cases, BUILDER PATTERN comes into picture.
        System.out.println("house1 = " + house1);
    }
}
