package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color colo) {
		super(board, colo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "R";
	}
}