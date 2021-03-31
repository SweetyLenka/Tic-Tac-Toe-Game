package tictactoe;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
	 public static char player1;
	 public static char computer;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO TIC-TAC-TOE GAME\n");
		
		char[][] Board = {{' ',' ',' '},
						  {' ',' ',' '},
						  {' ',' ',' '}};
		
		
		displayBoard(Board);
		allowPlayerToChooseEitherXorO();
		whoPlaysFirst(Board);
	}
	
	
	private static void computerTurn(char[][] Board) {
		
		
		String computerMove;
		while(true) {
		System.out.println("Computers Turn - Enter a desired location (1-9) : \n");
		Scanner scanner = new Scanner(System.in);
		computerMove=scanner.nextLine();
		
		if(isValidMove(Board,Integer.parseInt(computerMove))) {
			break;
		}else {
			System.out.println(computerMove+" is not a valid move");
		}
		}
		placeMove(Board,computerMove,computer);
		showBoard(Board);
		}
			
	
	public static void allowPlayerToChooseEitherXorO()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose either X or O :");
		String userInput = sc.nextLine();
		player1=userInput.charAt(0);
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

	public static void abiltytoMovetoDesiredLocation(char[][] Board) {
		String desiredLocation;
		while(true) {
		System.out.println("Players Turn - Enter a desired location (1-9) : \n");
		Scanner scanner = new Scanner(System.in);
		desiredLocation=scanner.nextLine();
		
		if(isValidMove(Board,Integer.parseInt(desiredLocation))) {
			break;
		}else {
			System.out.println(desiredLocation+" is not a valid move");
		}
		}
		placeMove(Board,desiredLocation,player1);
		showBoard(Board);
		}

	

	private static void placeMove(char[][] Board, String desiredLocation,char letter) {
		switch(desiredLocation) {
		case "1":
			Board[0][0]=letter;
			break;
		case "2":
			Board[0][1]=letter;
			break;
		case "3":
			Board[0][2]=letter;
			break;
		case "4":
			Board[1][0]=letter;
			break;
		case "5":
			Board[1][1]=letter;
			break;
		case "6":
			Board[1][2]=letter;
			break;
		case "7":
			Board[2][0]=letter;
			break;
		case "8":
			Board[2][1]=letter;
			break;
		case "9":
			Board[2][2]=letter;
			break;
		default:
			System.out.println("Choose a location between (1-9)");
		
		}
	}
		private static boolean isValidMove (char[][] Board, int position) {
			switch(position) {
				case 1:
					return (Board[0][0] == ' ');
				case 2:
					return (Board[0][1] == ' ');
				case 3:
					return (Board[0][2] == ' ');
				case 4:
					return (Board[1][0] == ' ');
				case 5:
					return (Board[1][1] == ' ');
				case 6:
					return (Board[1][2] == ' ');
				case 7:
					return (Board[2][0] == ' ');
				case 8:
					return (Board[2][1] == ' ');
				case 9:
					return (Board[2][2] == ' ');
				default:
					return false;
			}
		}
}
	
			
