package tictactoe;
import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO TIC-TAC-TOE GAME");
		char [][] gameBoard = {{' ','|',' ','|',' '},
				{' ','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		
		printGameBoard(gameBoard);
		 allowPlayerToChooseXorO();
		
	}
		
		
		
		
		public static void printGameBoard(char[][] gameBoard) {
			for(char[] row : gameBoard) {
				for(char c : row) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
		
	
		public static void allowPlayerToChooseXorO()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose X or O");
			String input=sc.nextLine();
			char player = input.charAt(0);
			char computer;
			if (player != 'X' && player != 'O' )
			{
				System.out.println("Choose either X or O ");
				
			}
			if(player == 'X')
			{
				computer='O';
				System.out.println("Player has chosen :"+player);
				System.out.println("Computer :"+computer);
			}
			else
			{
				computer='X';
				System.out.println("Computer : "+computer);
				System.out.println("Player :"+player);
			}
			
				
			
		}


	}


