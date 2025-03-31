package com.github.vkvish19.designpatterns.structural.flyweight_pattern.problem;

public class Game
{
    public static void main(String[] args)
    {
        Bullet[] bullets = new Bullet[10];
        // 5 red bullet objects
        for(int i=0; i<5; i++)
        {
            Bullet bullet = new Bullet("Red", i*10, i*12, 10);
            bullets[i] = bullet;
        }

        // 5 green bullet objects
        for(int i=0; i<5; i++)
        {
            Bullet bullet = new Bullet("Green", i*7, i*8, 12);
            bullets[i+5] = bullet;
        }

        // display
        for(int i=0; i<10; i++)
        {
            bullets[i].display();
        }

        // Problems:
        // Memory Overhead -> every bullet stores redundant data like color, image, etc.
        // Performance -> slow performance when many bullets are created
    }
}
