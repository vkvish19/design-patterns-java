package com.github.vkvish19.designpatterns.creational.builder_pattern.solution;

public class WithBuilderPattern
{
    public static void main(String[] args)
    {
        House house1 = new House.HouseBuilder("shingles", "concrete", "wood")
                .setSwimmingPool(false)
                .setGarage(true)
                .setGarden(true)
                .build();

        System.out.println("house1 = " + house1);
    }
}
