package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ; 
		System.out.println("Veuillez entrer un nombre :");
		int nb = scanner.nextInt();
		int somme = nb;
		
		for (int i=1; i<nb; i++) {
			somme +=i;
		}
		
		System.out.println(somme);

	}

}
