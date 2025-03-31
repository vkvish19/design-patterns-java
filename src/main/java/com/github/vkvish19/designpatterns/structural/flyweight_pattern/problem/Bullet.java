package com.github.vkvish19.designpatterns.structural.flyweight_pattern.problem;

public class Bullet
{
    // intrinsic property, shared by all objects (bullets)
    private String color;

    // Extrinsic properties, unique to each object (bullet)
    private int x, y;
    private int velocity;

    public Bullet(String color, int x, int y, int velocity)
    {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.printf("Creating bullet at (%s, %s) with velocity: %d%n", x, y, velocity);
    }

    public void display()
    {
        System.out.printf("Bullet at (%s, %s) moving with velocity: %d%n", x, y, velocity);
    }
}
