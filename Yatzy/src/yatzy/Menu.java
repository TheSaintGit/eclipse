package yatzy;

import java.util.Scanner;

public class Menu {

	public int menu1() {
		
		System.out.println("------------------");
		System.out.println("Vad vill du g�ra?");
		System.out.println("Tryck 1 f�r att kasta en eller fler t�rningar");
		System.out.println("Tryck 2 f�r att g� till resultat sidan");

		Scanner scan = new Scanner(System.in);
		int choise = scan.nextInt();
		
		
		
		
		
		return choise;
		

	}

	public int menu2() {
		
		System.out.println("------------------");
		System.out.println("Vad vill du g�ra?");
		System.out.println("Tryck 1 f�r att spara resultat");
		System.out.println("Tryck 2 f�r att starta ny omg�ng");
		System.out.println("Tryck 3 f�r att avsluta");
		
		Scanner scan = new Scanner(System.in);
		int choise = scan.nextInt();
		
		return choise;
		
	}
	
}
