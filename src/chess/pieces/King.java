package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color colo) {
		super(board, colo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "K";
	}
}