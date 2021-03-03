package yatzy;

import java.util.Scanner;

public class Menu {

	public int menu1() {
		
		System.out.println("------------------");
		System.out.println("Vad vill du göra?");
		System.out.println("Tryck 1 för att kasta en eller fler tärningar");
		System.out.println("Tryck 2 för att gå till resultat sidan");

		Scanner scan = new Scanner(System.in);
		int choise = scan.nextInt();
		
		
		
		
		
		return choise;
		

	}

	public int menu2() {
		
		System.out.println("------------------");
		System.out.println("Vad vill du göra?");
		System.out.println("Tryck 1 för att spara resultat");
		System.out.println("Tryck 2 för att starta ny omgång");
		System.out.println("Tryck 3 för att avsluta");
		
		Scanner scan = new Scanner(System.in);
		int choise = scan.nextInt();
		
		return choise;
		
	}
	
}
