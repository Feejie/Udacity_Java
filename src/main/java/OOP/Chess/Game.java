package OOP.Chess;

public class Game {
    private Piece[][] board;
    private static final int SIZE = 8;

    public Game() {
        board = new Piece[SIZE][SIZE];
    }

    public static int getSIZE() {
        return SIZE;
    }
}
