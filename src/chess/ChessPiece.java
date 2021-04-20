package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color colo;

	public ChessPiece(Board board, Color colo) {
		super(board);
		this.colo = colo;
	}

	public Color getColor() {
		return colo;
	}

	
	
}
