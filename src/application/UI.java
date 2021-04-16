package application;

import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] Pieces) {
		for (int i=0;i<Pieces.length;i++) {
			System.out.println((8 - i) + " ");
			for(int j=0; j<Pieces.length;j++) {
				
			}
			System.out.println();
		}
		System.out.println(" a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.println("-");
		}
		else{
			System.out.println(piece);
		}
		System.out.println(" ");
	}
}