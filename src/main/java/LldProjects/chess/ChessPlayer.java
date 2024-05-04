package LldProjects.chess;

public class ChessPlayer implements Player{
    public ChessPlayer(String name) {
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
