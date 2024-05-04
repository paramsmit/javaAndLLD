package LldProjects.chess2;

import LldProjects.chess2.pieces.*;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ChessGame extends Game{

    private ChessPlayer player1;
    private ChessPlayer player2;
    private ChessBoard chessBoard;
    ChessGame(ChessPlayer player1, ChessPlayer player2, ChessBoard board) {

        super(new ArrayDeque<>(List.of(player1, player2)), board);
        // note this. i didn't know. first line rule.

        this.player1 = player1;
        this.player2 = player2;
        this.chessBoard = board;
        prepareBoard(this.player1, this.player2, this.chessBoard);
    }

    private void prepareBoard(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard){
        putpawns(0, chessBoard, player1);
        putpawns(7, chessBoard, player2);
        putRooks(0, chessBoard, player1);
        putRooks(7, chessBoard, player2);
        putKnights(0, chessBoard, player1);
        putKnights(7, chessBoard, player2);
        putBishops(0, chessBoard, player1);
        putBishops(7, chessBoard, player2);
        putKing(0, chessBoard, player1);
        putKing(7, chessBoard, player1);
        putQueen(0, chessBoard, player1);
        putQueen(7, chessBoard, player1);

    }

    private void putpawns(int row, ChessBoard chessBoard, ChessPlayer chessPlayer){

        List<PieceName> pawns = List.of(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN2, PieceName.PAWN3,
                PieceName.PAWN4, PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7,
                PieceName.PAWN8 );

        int col = 0;

        for(PieceName pawn: pawns){
            Pawn p = new Pawn(pawn, chessPlayer.getColor(), false);
            chessBoard.getCells().get(row).get(col).setChessPiece(p);
            chessPlayer.getChessPieces().put(p.getName(), p);
        }
    }

    private void putRooks(int row, ChessBoard chessBoard, ChessPlayer chessPlayer){
        Rook rook1 = new Rook(PieceName.ROOK1, chessPlayer.getColor(), false);
        Rook rook2 = new Rook(PieceName.ROOK2, chessPlayer.getColor(), false);

        chessBoard.getCells().get(row).get(0).setChessPiece(rook1);
        chessBoard.getCells().get(row).get(7).setChessPiece(rook2);

        chessPlayer.getChessPieces().put(PieceName.ROOK1, rook1);
        chessPlayer.getChessPieces().put(PieceName.ROOK2, rook2);
    }

    private void putKnights(int row, ChessBoard chessBoard, ChessPlayer chessPlayer){

        Knight knight1 = new Knight(PieceName.KNIGHT1, chessPlayer.getColor(), false);
        Knight knight2 = new Knight(PieceName.KNIGHT2, chessPlayer.getColor(), false);

        chessBoard.getCells().get(row).get(1).setChessPiece(knight1);
        chessBoard.getCells().get(row).get(6).setChessPiece(knight2);
        chessPlayer.getChessPieces().put(PieceName.KNIGHT1,knight1);
        chessPlayer.getChessPieces().put(PieceName.KNIGHT2, knight2);
    }

    private void putBishops(int row, ChessBoard chessBoard, ChessPlayer chessPlayer){
        Bishop bishop1 = new Bishop(PieceName.BISHOP1, chessPlayer.getColor(), false);
        Bishop bishop2 = new Bishop(PieceName.BISHOP2, chessPlayer.getColor(), false);

        chessBoard.getCells().get(row).get(2).setChessPiece(bishop1);
        chessBoard.getCells().get(row).get(5).setChessPiece(bishop2);

        chessPlayer.getChessPieces().put(PieceName.BISHOP1, bishop1);
        chessPlayer.getChessPieces().put(PieceName.BISHOP2, bishop2);
    }

    private void putKing(int row, ChessBoard chessBoard, ChessPlayer chessPlayer){
        King king = new King(PieceName.KING, chessPlayer.getColor(), false);
        chessBoard.getCells().get(row).get(3).setChessPiece(king);
        chessPlayer.getChessPieces().put(PieceName.KING, king);
    }

    private void putQueen(int row, ChessBoard chessBoard, ChessPlayer chessPlayer){

        Queen queen = new Queen(PieceName.QUEEN, chessPlayer.getColor(), false);
        chessBoard.getCells().get(row).get(4).setChessPiece(queen);
        chessPlayer.getChessPieces().put(PieceName.QUEEN, queen);
    }

    @Override
    public boolean isOver() {
        return false;
    }
}
