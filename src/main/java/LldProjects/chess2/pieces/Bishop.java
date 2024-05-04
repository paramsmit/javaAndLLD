package LldProjects.chess2.pieces;

import LldProjects.chess2.*;

public class Bishop implements ChessPiece {
    private boolean dead;
    private Color color;
    private PieceName name;

    public Bishop(PieceName name, Color color, boolean dead) {
        this.dead = dead;
        this.color = color;
        this.name = name;
    }

    @Override
    public void move(Cell currentCell, Cell destCell, ChessBoard chessBoard) {

    }

    @Override
    public PieceName getName() {
        return this.name;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public boolean isDead() {
        return this.dead;
    }

    @Override
    public void setDead(boolean dead) {
        this.dead = true;
    }
}
