package com.github.vkvish19.designpatterns.creational.prototype_pattern.solution;

public class GameClientWithPrototypePattern
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
        GameBoard copiedBoard = originalBoard.clone();
        System.out.println("Copied Board State");
        copiedBoard.showBoardState();

        // Decoupled.
        // any changes in GameBoard, GamePiece does not alter the GameClient.
    }
}
