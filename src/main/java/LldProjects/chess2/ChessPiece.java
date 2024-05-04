package LldProjects.chess2;


public interface ChessPiece {

    void move(Cell currentCell, Cell destCell, ChessBoard chessBoard);

    PieceName getName();

    Color getColor();

    boolean isDead();

    void setDead(boolean dead);

}
