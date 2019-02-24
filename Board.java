import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Board {

	public int[] [] squares;
	public Map<String, String> blackPieces;
	public Map<String, String> whitePieces;
	
	public Board() {
		squares = new int [8] [8];
		blackPieces = new HashMap<>();
		whitePieces = new HashMap<>();
		setUp();
	}
	public void setUp() {
		
		for(int i = 0; i < squares.length; i++) {
			
			for(int k = 0; k < squares[i].length; k++) {
				String square = getCoordinate(i,k);
				if(square.charAt(1) == '2') {
					whitePieces.put(square, "Pawn");
				}
				if(square.charAt(1) == '7') {
					blackPieces.put(square, "Pawn");		
				}
				if(square.charAt(1) == '1') {
					switch(square.charAt(0)) {
					case 'a' :
					case 'h' :
					whitePieces.put(square, "Rook");
					break;
					
					case 'b' :
					case 'g' :
					whitePieces.put(square, "Knight");
					break;
					
					case 'c' :
					case 'f' :
					whitePieces.put(square, "Bishop");
					break;
					
					case 'd' :
					whitePieces.put(square, "Queen");
					break;
					
					case 'e' :
					whitePieces.put(square, "King");
					}
				}
				if(square.charAt(1) == '8') {
					switch(square.charAt(0)) {
					case 'a' :
					case 'h' :
					blackPieces.put(square, "Rook");
					break;
					
					case 'b' :
					case 'g' :
					blackPieces.put(square, "Knight");
					break;
					
					case 'c' :
					case 'f' :
					blackPieces.put(square, "Bishop");
					break;
					
					case 'd' :
					blackPieces.put(square, "Queen");
					break;
					
					case 'e' :
					blackPieces.put(square, "King");
					}
				}
			} 
		}
		System.out.println(Arrays.asList(whitePieces));
		System.out.println(Arrays.asList(blackPieces));
	}
	public String getCoordinate(int rank, int file) {
		String coordinate = "";
		switch(file + 1) {
		
		case 1 : coordinate += "a";
		break;
		
		case 2 : coordinate += "b";
		break;
		
		case 3 : coordinate += "c";
		break;
		
		case 4 : coordinate += "d";
		break;
		
		case 5 : coordinate += "e";
		break;
		
		case 6 : coordinate += "f";
		break;
		
		case 7 : coordinate += "g";
		break;
		
		case 8 : coordinate += "h";
		break;
		}
		coordinate += String.valueOf(rank + 1);
		return coordinate;
	}
	
	public int[] getSquareNum(String square) {
		int rank = 0;
		int file = 0;
		if(Integer.valueOf(square.substring(1)) > 8 || Integer.valueOf(square.charAt(0)) > 104 || Integer.valueOf(square.charAt(0)) < 97) {
			return null;
		}
		rank = Integer.valueOf(square.substring(1));
		switch(square.charAt(0)) {
				
			case 'a' : file = 1;
			break;
			
			case 'b' : file = 2;			
			break;
				
			case 'c' : file = 3;
			break;
				
			case 'd' : file = 4;
			break;
				
			case 'e' : file = 5;
			break;
			
			case 'f' : file = 6;
			break;
				
			case 'g' : file = 7;
			break;
				
			case 'h' : file = 8;
			break;	
		
		}
		int[] coordinate = {rank,file};
		return coordinate;
	}
}
