package jsnacks;

import java.util.Arrays;
import java.util.Random;

public class JSnack3 {
	public static void main(String[] args) {

		String[] nomi = { "Andrea", "Alessia", "Federico", "Federica", "Luigi", "Pasquale", "Biagio", "Rodolfo",
				"Giuseppe" };
		String[] cognomi = { "Cozzolino", "Esposito", "Brosio", "Iommelli", "Rentale", "Iacomino", "Tamburrino" };
		String[] invitati;
		invitati = new String[3];
		Random randomGenerator = new Random();

		System.out.println("Ciao ecco gli invitati alla tua festa di stasera");

		for (int i = 0; i < 3; i++) {
			int rannom = randomGenerator.nextInt(nomi.length);
			int rancog = randomGenerator.nextInt(cognomi.length);
			invitati[i] = rannom + " " + rancog;
			System.out.println(invitati[i]);
		}
		System.out.println(Arrays.toString(invitati));

	}
}
