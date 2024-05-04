package LldProjects.chess2;

public class Driver {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer firstPlayer = new HumanChessPlayer(chessBoard, "Param", Color.WHITE);
        ChessPlayer secondPlayer = new HumanChessPlayer(chessBoard, "Param2", Color.BLACK);
        Game chessBoardGame = new ChessGame(firstPlayer, secondPlayer, chessBoard);
        chessBoardGame.start();
    }
}
