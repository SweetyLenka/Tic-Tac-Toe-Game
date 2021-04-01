package tictactoe;
import java.util.Scanner;

/*@Description - Tic Tac Toe Game*/

public class TicTacToe {
	 
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO TIC-TAC-TOE GAME\n");
		
		//Creating a Tic-Tac-Toe Board
		char[][] Board = {{' ',' ',' '},
				  {' ',' ',' '},
				  {' ',' ',' '}};
		
		displayBoard(Board);
		
		
		
				
		}
	

	private static void displayBoard(char[][] Board) {
		System.out.println(Board[0][0]+ "|" + Board[0][1]+ "|" +Board[0][2]);
		System.out.println("-+-+-");
		System.out.println(Board[1][0]+ "|" + Board[1][1]+ "|" +Board[1][2]);
		System.out.println("-+-+-");
		System.out.println(Board[2][0]+ "|" + Board[2][1]+ "|" +Board[2][2]);
	}
				
		
		
	}



