package com.github.vkvish19.designpatterns.structural.flyweight_pattern.solution;

/**
 * Flyweight Class
 */
public class BulletType
{
    private final String color;  // Intrinsic property

    public BulletType(String color)
    {
        this.color = color;
        System.out.println("Creating bulletType with color: " + this.color);
    }

    public String getColor()
    {
        return color;
    }
}
