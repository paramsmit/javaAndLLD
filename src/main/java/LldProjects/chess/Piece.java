package LldProjects.chess;

public class Piece {
    private String type;
    private String color;
    private boolean alive;
    public Piece(String type, String color, boolean alive) {
        this.type = type;
        this.color = color;
        this.alive = alive;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
