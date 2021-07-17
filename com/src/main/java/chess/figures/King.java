package chess.figures;

import chess.Board;
import chess.Piece;
import chess.Spot;

public class King extends Piece {
    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        return false;
    }

    @Override
    public boolean isCastlingMove() {
        return false;
    }
}
