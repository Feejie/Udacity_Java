package OOP.Chess;

public class Bishop extends Piece {

    @Override
    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition)) {
            return false;
        }

        if (Math.abs(newPosition.getColumn() - this.getPosition().getColumn())
                == Math.abs(newPosition.getRow() - this.getPosition().getRow())) {
            return true;
        } else {
            return false;
        }
    }
}
