package LldProjects.chess2;

import java.util.Optional;

public class Cell {
    private int row;
    private int col;
    private Optional<ChessPiece> chessPiece;

    public Cell(int row, int col, ChessPiece chessPiece) {
        this.row = row;
        this.col = col;
        this.chessPiece = Optional.of(chessPiece);
    }

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Optional<ChessPiece> getChessPiece() {
        return chessPiece;
    }
    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = Optional.of(chessPiece);
    }

}
