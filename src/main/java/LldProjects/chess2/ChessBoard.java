package LldProjects.chess2;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board{

    List<List<Cell>> cells = new ArrayList<>();

    ChessBoard(){
        for(int i = 0; i < 7; i++){
            List<Cell> boardRow = new ArrayList<>();
            for(int j = 0; j < 7; j++){
                boardRow.add(new Cell(i,j));
            }
            cells.add(boardRow);
        }
    }

    @Override
    public void display() {

    }

    @Override
    public void applyMove(Move move) {
        ChessPiece chessPiece = move.getStartCell().getChessPiece().get();
        chessPiece.move(move.getStartCell(), move.getEndCell(), this);
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Cell getCell(int row, int col){
        return this.cells.get(row).get(col);
    }

    public void putCell(Cell cell, ChessPiece chessPiece){
        cell.setChessPiece(chessPiece);
    }

}
