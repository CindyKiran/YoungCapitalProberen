import java.util.Random;
import java.util.Scanner;

public class Ganzenbord {
	static int placeNumb = 1; 
	static int a;
	static boolean gameStatus = true;
	static String input;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Ganzenbord Game! You are at 1. ");

		displayMenu();
		
		while(gameStatus == true) {
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextLine();
			
			if(input.toLowerCase().equals("g")) {
				throwDice();
				checkPlace();
			} else if(input.toLowerCase().equals("x")) {
				System.out.println("Exit the game");
				gameOver();
				gameStatus = false;
			} else if(input.toLowerCase().equals("m")) {
				displayMenu();
			} else {
				System.out.println("Invalid input. Type g, m or x");
				displayMenu();
			}
		}
	}
	
	static void displayMenu() {
		System.out.println("---------------------------------"
				+ "\nOption Menu: "
				+ "\n---------------------------------"
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
			gameOver();
			gameStatus = false;
		} else if(placeNumb >=63) {
			winningGame();
		} else if(placeNumb == 25 || placeNumb == 45) {
			System.out.println("Too bad! You landed on " + placeNumb + ". You have to start from 1 again");
			placeNumb = 1;
		} else if((placeNumb%10)==0) {
			switch(placeNumb) {
			case 10:
				System.out.println("Hooray, you are at 10. ");
				break;
			case 20:
				System.out.println("Hooray, you are at 20. ");
				break;
			case 30: 
				System.out.println("Hooray, you are at 30. ");
				break;
			case 40:
				System.out.println("Hooray, you are at 40. ");
				break;
			case 50: 
				System.out.println("Hooray, you are at 50. ");
				break;
			case 60: 
				System.out.println("Hooray, you are at 60. ");
				break;
			}
			System.out.println("Go " + a + " steps further");
			placeNumb+=a;
			
			if(placeNumb > 63) {
				winningGame();
			}
			
			System.out.println("You are now at " + placeNumb);
		} 
		else {
			System.out.println("You are now at " + placeNumb + " You are save");
		}
	}
	static void winningGame() {
		if(placeNumb == 63) {
			System.out.println("You are at 63. You have won!");
		} else {
			System.out.println("You have passed 63. You have won!");
		}
		placeNumb = 0;
		System.out.println(" __     __   ____    _    _    __          __   ____    _   _ ");
		System.out.println(" \\ \\   / /  / __ \\  | |  | |   \\ \\        / /  / __ \\  | \\ | |");
		System.out.println("  \\ \\_/ /  | |  | | | |  | |    \\ \\  /\\  / /  | |  | | |  \\| |");
		System.out.println("   \\   /   | |  | | | |  | |     \\ \\/  \\/ /   | |  | | | . ` |");
		System.out.println("    | |    | |__| | | |__| |      \\  /\\  /    | |__| | | |\\  |");
		System.out.println("    |_|     \\____/   \\____/        \\/  \\/      \\____/  |_| \\_|");
		
		displayMenu();
	}
	static void gameOver() {
		System.out.println("   _____              __  __   ______      ____   __      __  ______   _____  ");
		System.out.println("  / ____|     /\\     |  \\/  | |  ____|    / __ \\  \\ \\    / / |  ____| |  __ \\ ");
		System.out.println(" | |  __     /  \\    | \\  / | | |__      | |  | |  \\ \\  / /  | |__    | |__) |");
		System.out.println(" | | |_ |   / /\\ \\   | |\\/| | |  __|     | |  | |   \\ \\/ /   |  __|   |  _  / ");
		System.out.println(" | |__| |  / ____ \\  | |  | | | |____    | |__| |    \\  /    | |____  | | \\ \\ ");
		System.out.println("  \\_____| /_/    \\_\\ |_|  |_| |______|    \\____/      \\/     |______| |_|  \\_\\");

		
	}
}
