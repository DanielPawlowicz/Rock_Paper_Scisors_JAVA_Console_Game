import java.util.Random;
import java.util.Scanner;

public class Main {

	static boolean gameStarted = false;
	static Random random;
	static Scanner scanner;
	static String uChoice;
	static String cChoice;
	static int uPoints = 0;
	static int cPoints = 0;
	
	
	public static void startGame() {
		gameStarted = true;
//		System.out.println("Works");
		
		// Random computer's choice
		random = new Random();
		int rNumber = random.nextInt(3);
		switch(rNumber) {
			case 0:
				cChoice = "R";
				break;
			case 1:
				cChoice = "P";
				break;
			case 2:
				cChoice = "S";
				break;
		}
		
		System.out.println(cChoice);
		
		// Asking user for his choice
			//Validating user's choice
		while(true){
			scanner = new Scanner(System.in);
			System.out.println("Make your choice - type: \n"
								+ "R = Rock \n"
								+ "P = Paper \n"
								+ "S = Scisors");
			uChoice = scanner.nextLine();
			uChoice = uChoice.toUpperCase();
			if(uChoice.equals("R"))
				break;
			else if(uChoice.equals("P"))
				break;
			else if(uChoice.equals("S"))
				break;
			else
				System.out.println("Not a valid response. Try again");
		}
		
		checkWins();
	}
	
	public static void checkWins() {
		
		if(uChoice.equals(cChoice)) {
			
			System.out.println("Draw!");
			
				} else if(uChoice.equals("R")) {
					
					if(cChoice.equals("S"))
						uPoints++;
					else
						cPoints++;
					
		//			System.out.println("Error");
					
				} else if(uChoice.equals("P")) {
					
					if(cChoice.equals("R"))
						uPoints++;
					else
						cPoints++;
					
		//			System.out.println("Error");
					
				} else {
					if(cChoice.equals("P"))
						uPoints++;
					else
						cPoints++;
					
		//			System.out.println("Error");
				
		}
		
//		System.out.println("The end");
		
	}
	
	public static void displayScore() {
		
	}
	
	public void nextRound() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		startGame();
		
	}

}
