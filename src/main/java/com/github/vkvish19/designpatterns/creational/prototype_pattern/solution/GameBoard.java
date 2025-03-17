package com.github.vkvish19.designpatterns.creational.prototype_pattern.solution;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements PrototypeCloner<GameBoard>
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

    @Override
    public GameBoard clone()
    {
        GameBoard clonedBoard = new GameBoard();
        for(GamePiece gamePiece : pieces)
        {
            clonedBoard.addPiece(gamePiece.clone());
        }
        return clonedBoard;
    }

    public List<GamePiece> getPieces()
    {
        return pieces;
    }
}
