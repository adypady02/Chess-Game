
public class Game {

	public Board board;
	private Player white;
	private Player black;
	
	public Game() {
		board = new Board();
		setWhitePlayer();
		setBlackPlayer();
	}
	
	public void	setWhitePlayer() {
		
	}
	
	public void setBlackPlayer() {
		
	}
	
	public void move(String move) {
		String square = move.substring(1);
		
		switch(move.substring(0, 1)) {
		
		case "K" : King test = new King(square);
		break;
		
		case "Q" : Queen test = new Queen(square);
		break;
		
		case "R" : Rook test = new Rook(square);
		break;
		
		case "B" : King test = new Bishop(square);
		break;
		
		case "N" : King test = new Knight(square);
		break;
		
		case "P" : King test = new Pawn(square);
		break;
		}
	}
	 
	/*public String getPiece(String s) {
		switch(s.toUpperCase()) {
		case "K" : return "King";
		
		case "Q" : return "Queen";
		
		case "R" : return "Rook";
		
		case "B" : return "Bishop";
		
		case "N" : return "Knight";
		
		case "P" : return "Pawn";
		}
		return "";*/
	}
}
