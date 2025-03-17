package com.github.vkvish19.designpatterns.creational.prototype_pattern.solution;

public class GamePiece implements PrototypeCloner<GamePiece>
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

    @Override
    public GamePiece clone()
    {
        return new GamePiece(this.color, this.position);
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
