package OOP.Chess;

public class Rock extends Piece {

    @Override
    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition)) {
            return false;
        }

        if (newPosition.getColumn() == this.getPosition().getColumn()
                || newPosition.getRow() == this.getPosition().getRow()) {
            return true;
        } else {
            return false;
        }
    }
}
