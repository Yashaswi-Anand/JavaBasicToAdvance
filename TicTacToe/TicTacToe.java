package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	private Player player1,player2;
	private Board board;
	private int numPlayer; 

	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
		t.startGame();
		
	}
	
	public void startGame(){
		Scanner sc = new Scanner(System.in);
		// take player input
		player1 = takePlayerInput(++numPlayer);
		player2 = takePlayerInput(++numPlayer);
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbol already taken!! Please enter the symbol again");
			player2.setSymbol(sc.next().charAt(0));
		}
		// Create the board
		board = new Board(player1.getSymbol(),player2.getSymbol());
		// Play the game
		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE) {
			if(player1Turn) {
				System.out.println("Player 1 - " + player1.getName()+ "'s turn:");
				System.out.println("Enter x:");
				int x = sc.nextInt();
				System.out.println("Enter y:");
				int y = sc.nextInt();
				
				status = board.move(player1.getSymbol(),x,y);
				if(status == Board.INVALIDMOVE) {
					System.out.println("Invalid move!! Please try again !!");
					continue;
				}
			}else {
				System.out.println("Player 2 - " + player2.getName()+ "'s turn:");
				System.out.println("Enter x:");
				int x = sc.nextInt();
				System.out.println("Enter y:");
				int y = sc.nextInt();
				
				status = board.move(player2.getSymbol(),x,y);
				if(status == Board.INVALIDMOVE) {
					System.out.println("Invalid move!! Please try again !!");
					continue;
				}
			}
			
			player1Turn = !player1Turn;
			board.print();
			
			if(status == Board.PLAYER1WIN) {
				System.out.println(player1.getName() + " "+ " win the match.!!");
			}else if(status == Board.PLAYER2WIN){
				System.out.println(player2.getName() +" win the match.!!");
			}else if(status == Board.DRAW){
				System.out.println("Match Draw !!");
			}
		}
	}

	private Player takePlayerInput(int num) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player "+ num + " name:");
		String name = sc.next();
		System.out.println("Enter Player "+ num + " symbol:");
		char symbol = sc.next().charAt(0);
		Player player = new Player(name,symbol);
		return player;
	}
}
