package com.github.vkvish19.designpatterns.structural.flyweight_pattern.solution;

public class Bullet
{
    // intrinsic property, shared by all objects (bullets)
    private BulletType bulletType;

    // Extrinsic properties, unique to each object (bullet)
    private int x, y;
    private int velocity;

    public Bullet(String color, int x, int y, int velocity)
    {
        this.bulletType = BulletTypeFactory.getBulletType(color);
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
