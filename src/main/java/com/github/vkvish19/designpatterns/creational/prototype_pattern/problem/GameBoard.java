package com.github.vkvish19.designpatterns.creational.prototype_pattern.problem;

import java.util.ArrayList;
import java.util.List;

public class GameBoard
{
    private List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece gamePiece)
    {
        pieces.add(gamePiece);
    }

    public void showBoardState()
    {
        System.out.println("Board State:");
        for(GamePiece gamePiece : pieces)
        {
            System.out.println(gamePiece);
        }
    }

    public List<GamePiece> getPieces()
    {
        return pieces;
    }
}
