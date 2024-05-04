package LldProjects.chess;

import java.util.List;
import java.util.Scanner;

public class ChessGame implements Game{

    private ChessBoard chessBoard;
    private List<ChessPlayer> chessPlayerList;

    public ChessGame(ChessBoard chessBoard, List<ChessPlayer> chessPlayerList) {
        this.chessBoard = chessBoard;
        this.chessPlayerList = chessPlayerList;
    }


    public void start(){

        int turn = 0;

        while(true){

            Scanner scanner = new Scanner(System.in);

            System.out.println("enter the starting x and y");

            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            Position startPosition = new Position(x1, y1);

            System.out.println("enter the ending x and y");

            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            Position endPosition = new Position(x2, y2);

            Move move = new Move(startPosition, endPosition);

            if(!isValidMove(move, this.chessBoard, this.chessPlayerList.get(turn))){
                System.out.println("invalid move");
                System.out.println("enter again");
                continue;
            }

            performMove(move, chessBoard, chessPlayerList.get(turn));

            turn = turn == 0 ? 1 : 0;
        }

    }

    private boolean isValidMove(Move move, ChessBoard chessBoard, ChessPlayer chessPlayer){
        return true;
    }

    private void performMove(Move move, ChessBoard chessBoard, ChessPlayer chessPlayer){
        // implement this
    }

    public ChessBoard getBoard() {
        return chessBoard;
    }

    public void setBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public List<ChessPlayer> getPlayerList() {
        return chessPlayerList;
    }

    public void setPlayerList(List<ChessPlayer> chessPlayerList) {
        this.chessPlayerList = chessPlayerList;
    }

}
