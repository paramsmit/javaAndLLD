package LldProjects.chess2;


import java.util.Queue;

public abstract class Game {

    private Queue<Player> playerQueue;

    private Board board;

    Game(Queue<Player> playerQueue, Board board){
        this.playerQueue = playerQueue;
        this.board = board;
    }

    public void start(){
        while(true){
            Player p = playerQueue.poll();
            playerQueue.remove();
            Move move = p.makeMove();
            board.applyMove(move);
            if(isOver()){
                System.out.println("player " + p.getName() + " is victorious");
                break;
            }
            // loop break conditions
            playerQueue.add(p);
        }
    }

    public abstract boolean isOver();
    // this is so cool.
    // we can use the abstract method without declaring it's body
    // i didn't know this

}
