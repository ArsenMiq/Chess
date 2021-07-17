package chess.figures;

import chess.Board;
import chess.Piece;
import chess.Spot;

public class Pawn extends Piece {
    public Pawn(boolean b) {
        super(b);
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
