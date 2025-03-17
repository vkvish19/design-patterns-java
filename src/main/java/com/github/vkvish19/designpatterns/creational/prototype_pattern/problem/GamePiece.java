package com.github.vkvish19.designpatterns.creational.prototype_pattern.problem;

public class GamePiece
{
    private String color;
    private int position;

    public GamePiece()
    {
    }

    public GamePiece(String color, int position)
    {
        this.color = color;
        this.position = position;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    @Override
    public String toString()
    {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}
