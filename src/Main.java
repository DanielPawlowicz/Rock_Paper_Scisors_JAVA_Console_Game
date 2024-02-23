import java.util.Random;
import java.util.Scanner;

public class Main {

	static boolean gameStarted = false;
	static Random random;
	Scanner scanner;
	String usersChoice;
	static String computersChoice;
	int usersPoints = 0;
	int computersPoints = 0;
	
	
	public static void startGame() {
		gameStarted = true;
//		System.out.println("Works");
		
		// Random computer's choice
		random = new Random();
		int rNumber = random.nextInt(3);
		switch(rNumber) {
			case 0:
				computersChoice = "Rock";
				break;
			case 1:
				computersChoice = "Paper";
				break;
			case 2:
				computersChoice = "Scisors";
				break;
		}
		
		
		// Asking user for 
		
	}
	
	public void checkWins() {
		
	}
	
	public void displayScore() {
		
	}
	
	public void nextRound() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startGame();
		
	}

}
