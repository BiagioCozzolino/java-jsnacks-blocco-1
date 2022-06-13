package jsnacks;

import java.util.Scanner;

public class JSnack1 {
	public static void main(String[] args) {
		
		int somma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto alla somma dei 5 numeri!");

		for (int i = 0; i < 5; i++) {
			System.out.print("Inserisci un numero: ");
			somma = somma + scan.nextInt();
		}
		System.out.println(somma);


	}

}
