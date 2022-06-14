package jsnacks;

import java.util.Scanner;

public class JSnack5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci due parole di uguale lunghezza");
		System.out.print("Prima parola: ");
		String parola1 = scanner.nextLine();
		System.out.print("Seconda parola: ");
		String parola2 = scanner.nextLine();

		if (parola1.length() == parola2.length()) {
			int distanzaHamming = 0;
			char[] parola1Array = parola1.toCharArray();
			char[] parola2Array = parola2.toCharArray();
			for (int i = 0; i < parola1Array.length; i++) {
				if (parola1Array[i] != parola2Array[i]) {
					distanzaHamming++;
				}

			}
			System.out.println("La distanza di Hamming tra le due parole è di " + distanzaHamming);

		} else {
			System.out.println("Le due parole scelte non sono della stessa lunghezza");
		}
		scanner.close();
	}

}
