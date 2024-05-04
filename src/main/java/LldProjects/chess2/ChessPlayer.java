package LldProjects.chess2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class ChessPlayer implements Player{
    private Map<PieceName, ChessPiece> chessPieces;
    protected ChessBoard chessBoard;
    protected Color color;

    ChessPlayer(ChessBoard chessBoard, Color color){
        chessPieces = new HashMap<>();
        this.chessBoard = chessBoard;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
    public Map<PieceName,ChessPiece> getChessPieces() {
        return chessPieces;
    }

    public Optional<ChessPiece> getPiece(PieceName pieceName){
        return Optional.ofNullable(chessPieces.get(pieceName));
    }

    public void putPiece(ChessPiece chessPiece){
        this.chessPieces.put(chessPiece.getName(), chessPiece);
    }

}
