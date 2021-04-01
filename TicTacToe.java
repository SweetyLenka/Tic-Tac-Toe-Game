package tictactoe;
import java.util.Scanner;

public class TicTacToe {
	
	public static void displayBoard(char[][] Board) {
		System.out.println(Board[0][0]+ "|" + Board[0][1]+ "|" +Board[0][2]);
		System.out.println("-+-+-");
		System.out.println(Board[1][0]+ "|" + Board[1][1]+ "|" +Board[1][2]);
		System.out.println("-+-+-");
		System.out.println(Board[2][0]+ "|" + Board[2][1]+ "|" +Board[2][2]);
	}
	
	/* UC2 - Ability to allow the player to choose a letter X or O */
				
	public static void allowPlayerToChooseEitherXorO()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose either X or O :");
		String userInput = sc.nextLine();
		char player1=userInput.charAt(0);
		char computer;
		if (player1 != 'X' && player1 != '0' && player1 != 'x' && player1 != 'o' )
		{
			System.out.println("Please enter a valid choice (Enter either X or O) : ");
			 userInput = sc.nextLine();
			 player1=userInput.charAt(0);
		}	
		if(player1 == 'X' || player1 == 'x')
			computer ='O';
		else
			computer = 'X';
		
	}
	
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO TIC-TAC-TOE GAME\n");
		
		char[][] Board = {{' ',' ',' '},
						  {' ',' ',' '},
						  {' ',' ',' '}};
		
		
		displayBoard(Board);
		allowPlayerToChooseEitherXorO();
		
		}

	
	
	
	
}


