package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ; 
		int[] array = new int[10];
		
		System.out.println("Veuillez entrer 10 nombres :");
		
		for (int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int max = 0;
		for (int i=0; i<array.length; i++) {
			if (max<array[i]) {
				max=array[i];
			}
		}
		
		System.out.println("Le nombre le plus grand est : " + max);

	}

}
