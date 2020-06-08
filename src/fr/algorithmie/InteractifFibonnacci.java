package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choisissez un rang : ");
		int n = scanner.nextInt();
		int terme = 0;
		
		if (n == 0 || n == 1) {
			terme = n;
			System.out.println(terme);
		}
		else if (n < 0) {
			System.out.println("Le rang doit être un nombre positif !");
			System.out.println("Choisissez un rang : ");
			n = scanner.nextInt();
		}
		else {
			int nRangMoins2 = 0;
			int nRangMoins1 = 1;
			for (int i=1; i<=n-1; i++) {
				terme = nRangMoins2 + nRangMoins1;
				nRangMoins2 = nRangMoins1;
				nRangMoins1 = terme;
			}
			System.out.println(terme);	
		}
		

	}

}
