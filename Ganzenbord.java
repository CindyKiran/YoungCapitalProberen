import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {
	static int placeNumb = 1;
	static int a;
	static boolean gameStatus = true;
	
	public static void main(String[] args) {
		displayMenu();
		
		while(gameStatus == true) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.toLowerCase().equals("g")) {
				throwDice();
				checkPlace();
			} else if(input.toLowerCase().equals("x")) {
				System.out.println("Exit the game");
				gameStatus = false;
			} else if(input.toLowerCase().equals("m")) {
				displayMenu();
			} else {
				System.out.println("Invalid input. Type g, m or x");
			}
		}
		
		
	}
	
	static void displayMenu() {
		System.out.println("---------------------------------"
				+ "\nOption Menu: "
				+ "\nPress g to throw Dice "
				+ "\nPress x to exit the game"
				+ "\nPress m to view menu option again "
				+ "\n---------------------------------");
	}
	
	static void throwDice() {
		Random random = new Random(); 
		a = random.nextInt(6)+1;
		placeNumb +=a;
	}
	
	static void checkPlace() {
		if(placeNumb == 23) {
			System.out.println("You are at " + placeNumb + ". You are in jail. Game over");
			gameStatus = false;
		}
		if(placeNumb >=63) {
			System.out.println("You are at " + placeNumb + ". You have won!");
			gameStatus = false;
		}
		if(placeNumb == 25 || placeNumb == 45) {
			System.out.println("Too bad! You landed on " + placeNumb + ". You have to start from 1 again");
			placeNumb = 1;
		}
		if((placeNumb%10)==0) {
			System.out.println("Go " + a + " steps further");
			placeNumb+=a;
			System.out.println("You are now at " + placeNumb);
			if(placeNumb >= 63) {
				System.out.println("You have won!");
				gameStatus = false;
			}
		} 
		else {
			System.out.println("You are now at " + placeNumb + " You are save");
		}
	}
}
