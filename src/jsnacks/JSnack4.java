package jsnacks;

import java.util.Arrays;
import java.util.Random;

public class JSnack4 {
	public static void main(String[] args) {
		int[] numeri = new int[50];
		Random rand = new Random();

		for (int i = 0; i < numeri.length; i++) {
			numeri[i] = rand.nextInt(101);
		}
		System.out.println(Arrays.toString(numeri));

		int somma = 0;
		for (int i = 0; i < numeri.length; i++) {
			if ((i % 2) != 0) {
				somma += numeri[i];
			}

		}
		System.out.println(somma);
	}

}
