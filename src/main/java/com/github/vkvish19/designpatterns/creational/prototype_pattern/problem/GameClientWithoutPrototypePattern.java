package com.github.vkvish19.designpatterns.creational.prototype_pattern.problem;

public class GameClientWithoutPrototypePattern
{
    public static void main(String[] args)
    {
        GameBoard originalBoard = new GameBoard();
        originalBoard.addPiece(new GamePiece("red", 1));
        originalBoard.addPiece(new GamePiece("blue", 7));
        originalBoard.addPiece(new GamePiece("green", 3));

        System.out.println("Current Board State");
        originalBoard.showBoardState();

        // checkpoint this state
        GameBoard copiedBoard = new GameBoard();
        for(GamePiece gamePiece : originalBoard.getPieces())
        {
            copiedBoard.addPiece(new GamePiece(gamePiece.getColor(), gamePiece.getPosition()));
        }

        System.out.println("Copied Board State");
        copiedBoard.showBoardState();

        // so in this approach, the client code needs to take care of making copies, which is not correct.
        // also if there is any new field added in the GamePiece we again need to make logic changes in GameBoard
        // as well as in the GameClient, which is also not proper.

        // Tight coupling.
        // Ideally, the copying/cloning logic should be taken care by respective classes itself.
        // Changes in GamePiece -> to be handled in GamePiece
        // Changes in GameBoard -> to be handled in GameBoard
    }
}
