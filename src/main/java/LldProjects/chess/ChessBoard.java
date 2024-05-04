package LldProjects.chess;

public class ChessBoard implements Board {

    private Piece[][] pieces;

    public Piece[][] getPieces() {
        return pieces;
    }
    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public ChessBoard() {

        pieces = new Piece[8][8];

        for(int i = 0; i < 8; i++){
            pieces[1][i] = new Piece("pawn", "white", true);
            pieces[6][i] = new Piece("pawn", "black", true);
        }

        pieces[0][0] = new Piece("rook", "white", true);
        pieces[0][7] = new Piece("rook", "white", true);

        pieces[0][1] = new Piece("knight", "white", true);
        pieces[0][6] = new Piece("knight", "white", true);

        pieces[0][2] = new Piece("bishop", "white", true);
        pieces[0][5] = new Piece("bishop", "white", true);

        pieces[0][3] = new Piece("king", "white", true);
        pieces[0][4] = new Piece("queen", "white", true);

        pieces[7][0] = new Piece("rook", "black", true);
        pieces[7][7] = new Piece("rook", "black", true);

        pieces[7][1] = new Piece("knight", "black", true);
        pieces[7][6] = new Piece("knight", "black", true);

        pieces[7][2] = new Piece("bishop", "black", true);
        pieces[7][5] = new Piece("bishop", "black", true);

        pieces[7][3] = new Piece("king", "black", true);
        pieces[7][4] = new Piece("queen", "black", true);

    }
}
