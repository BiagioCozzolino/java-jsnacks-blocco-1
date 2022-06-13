package jsnacks;

import java.util.Scanner;

public class JSnack1 {
	public static void main(String[] args) {

		int somma = 0;
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		/*
		 * Con ciclo For
		 * 
		 * 
		 * System.out.println("Benvenuto alla somma dei 5 numeri!");
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.print("Inserisci un numero: ");
		 * somma = somma + scan.nextInt(); }
		 */
		// Con ciclo while

		System.out.println("Benvenuto alla somma dei 5 numeri!");
		while (flag < 5) {
			System.out.print("Inserisci un numero: ");
			somma = somma + scan.nextInt();
			flag = flag + 1;
		}
		System.out.println(somma);
		scan.close();

	}

}
