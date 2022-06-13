package jsnacks;

import java.util.Scanner;

public class JSnack2 {
	public static void main(String[] args) {
		
		int numero = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ciao scrivi un numero: ");
		numero = scan.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println(numero);
			
		}else {
			System.out.println(numero + 1);

		}
		
		scan.close();
	}

}
