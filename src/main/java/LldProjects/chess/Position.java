package LldProjects.chess;

public class Position {
    public Position(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }

    private Integer row;
    private Integer col;

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

}
