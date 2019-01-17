import java.util.Scanner;


class Dinsdag{
	static int broodPrice = 1;
	static int visPrice = 2;
	static int vleesPrice = 3;

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hoeveel brood?");
		int broodAantal = scanner.nextInt();
		System.out.println("Hoeveel vis?");
		int visAantal = scanner.nextInt();
		System.out.println("Hoeveel vlees?");
		int vleesAantal = scanner.nextInt();
		
		

		total(broodAantal, visAantal, vleesAantal);
	}

	static void total(int broodAantal, int visAantal, int vleesAantal){
		System.out.println("Uw totaal: " + ((broodAantal * broodPrice) + (visAantal * visPrice) + (vleesAantal * vleesPrice)));
	}

}