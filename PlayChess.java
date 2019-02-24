import java.util.Arrays;
import java.util.Scanner;

public class PlayChess {

	public static void main(String[] args) {
		Game play = new Game();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Play chess with someone else!\n\n Notation is <First letter of Piece><Square> (e.g. Qe4) Make your move :: ");
		boolean validNotation = false;
		
		while(!validNotation) {
			String notation = keyboard.next();
			if(notation.charAt(0) == 'K' || notation.charAt(0) == 'Q' || notation.charAt(0) == 'R' || notation.charAt(0) == 'B' || notation.charAt(0) == 'N' || notation.charAt(0) == 'P') {
				if(play.board.getSquareNum(notation.substring(1)) == null) 
					{
						System.out.println("Please enter a valid move");
					}
				else 
				{
					validNotation = true;
					play.move(notation);
				}	
			}
			else {
				System.out.println("Please enter a valid move");
			}
		}
		
		System.out.println(Arrays.toString(play.board.getSquareNum("f5")));
		
		keyboard.close();
	}

}
