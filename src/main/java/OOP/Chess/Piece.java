package OOP.Chess;

public class Piece {
    private Position position;

    public Piece() {
//        this.position = new Position();
    }

    boolean isValidMove(Position newPosition) {
        if (newPosition.getRow() > 0 && newPosition.getColumn() > 0
                && newPosition.getRow() < Game.getSIZE() && newPosition.getColumn() < Game.getSIZE()) {
            return true;
        } else {
            return false;
        }
    }

    public Position getPosition() {
        return position;
    }
}
