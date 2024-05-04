package LldProjects.chess2;

public class ComputerChessPlayer extends ChessPlayer{
    public ComputerChessPlayer(ChessBoard chessBoard, String name, Color color) {
        super(chessBoard,color);
        this.name = name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Move makeMove() {
        return new Move(null, null);
    }
}
