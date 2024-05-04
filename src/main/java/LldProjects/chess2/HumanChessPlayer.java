package LldProjects.chess2;

import java.util.Objects;
import java.util.Scanner;
public class HumanChessPlayer extends ChessPlayer{
    public HumanChessPlayer(ChessBoard chessBoard, String name, Color color) {
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

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter start cell");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();


        System.out.println("enter end cell");

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Cell startCell = this.chessBoard.getCell(x1,y1);
        Cell endCell = this.chessBoard.getCell(x2,y2);

        if(startCell.getChessPiece().isEmpty()){
            throw new RuntimeException("selected empty cell");
        }

        if(Objects.equals(startCell.getChessPiece().get().getColor(), getColor())){
            throw new RuntimeException("selected invalid piece");
        }

        return new Move(startCell, endCell);
    }
}
