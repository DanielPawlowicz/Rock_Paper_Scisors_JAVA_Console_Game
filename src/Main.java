import java.util.Random;
import java.util.Scanner;

public class Main {

	static boolean gameStarted = false;
	static Random random;
	static Scanner scanner;
	static String usersChoice;
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
		
		
		// Asking user for his choice
			//Validating user's choice
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("Make your choice - type: \n"
								+ "R = Rock \n"
								+ "P = Paper \n"
								+ "S = Scisors");
			usersChoice = scanner.nextLine();
			usersChoice = usersChoice.toUpperCase();
			if(usersChoice.equals("R"))
				break;
			else if(usersChoice.equals("P"))
				break;
			else if(usersChoice.equals("S"))
				break;
			else
				System.out.println("Not a valid response. Try again");
		}
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
