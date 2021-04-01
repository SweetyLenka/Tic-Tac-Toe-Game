package tictactoe;
import java.util.Scanner;

public class TicTacToe {
	 public static char player1;
	
	/*UC2 - Ability to allow the player to choose a letter X or O*/
	public static void allowPlayerToChooseEitherXorO()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose either X or O :");
		String userInput = sc.nextLine();
		player1=userInput.charAt(0);
		char computer;
		if (player1 != 'X' && player1 != 'O' && player1 != 'x' && player1 != 'o' )
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
	public static void displayBoard(char[][] Board) {
		System.out.println("-------TIC TAC TOE BOARD------");
		System.out.println(Board[0][0]+ "|" + Board[0][1]+ "|" +Board[0][2]);
		System.out.println("-+-+-");
		System.out.println(Board[1][0]+ "|" + Board[1][1]+ "|" +Board[1][2]);
		System.out.println("-+-+-");
		System.out.println(Board[2][0]+ "|" + Board[2][1]+ "|" +Board[2][2]);
	
	}
	
	

	public static void showBoard(char[][] Board) {
		System.out.println("--------Showing Current Board------");
		System.out.println(Board[0][0]+ "|" + Board[0][1]+ "|" +Board[0][2]);
		System.out.println("-+-+-");
		System.out.println(Board[1][0]+ "|" + Board[1][1]+ "|" +Board[1][2]);
		System.out.println("-+-+-");
		System.out.println(Board[2][0]+ "|" + Board[2][1]+ "|" +Board[2][2]);
	
	
	}
	
	/*UC4 - Ability for user to make a move to a desired location in the board*/
	
	public static void abiltytoMovetoDesiredLocation(char[][] Board) {
		System.out.println("Enter a desired location (1-9) : \n");
		Scanner scanner = new Scanner(System.in);
		String desiredLocation=scanner.nextLine();
		System.out.println("Loaction Selected :"+desiredLocation);
		switch(desiredLocation) {
		case "1":
			Board[0][0]=player1;
			break;
		case "2":
			Board[0][1]=player1;
			break;
		case "3":
			Board[0][2]=player1;
			break;
		case "4":
			Board[1][0]=player1;
			break;
		case "5":
			Board[1][1]=player1;
			break;
		case "6":
			Board[1][2]=player1;
			break;
		case "7":
			Board[2][0]=player1;
			break;
		case "8":
			Board[2][1]=player1;
			break;
		case "9":
			Board[2][2]=player1;
			break;
		default:
			System.out.println("Choose a location between (1-9)");
		
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO TIC-TAC-TOE GAME\n");
		
		char[][] Board = {{' ',' ',' '},
						  {' ',' ',' '},
						  {' ',' ',' '}};
		
		
		displayBoard(Board);
		allowPlayerToChooseEitherXorO();
		abiltytoMovetoDesiredLocation(Board);
		showBoard(Board);
		
		}
		
	
			
}


