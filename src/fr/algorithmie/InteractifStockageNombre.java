package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int commande;
		int[] array = new int[0];
		
		while(true) {
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			System.out.println("3. Quitter");
			
			commande = scanner.nextInt();
			
			if(commande == 3) {
				System.out.println("Fin de programme !");
				break;
			}
			else if (commande == 1) {
				//instructions ajouter
				System.out.println("Veuillez ajouter un nombre :");
				int nb = scanner.nextInt();
				int[] temp = new int[array.length + 1];
				for (int i=0; i<temp.length-1 && array.length > 0; i++) {
					temp[i] = array[i];
				}
				temp[temp.length-1] = nb;
				array = temp;
				
			}
			else if (commande == 2) {
				//instructions afficher
				if (array.length==0) {
					System.out.println("Ce tableau ne contient pas de nombre.");
				}
				else {
					afficher(array);
				}
			}
			else {
					System.out.println("Je n'ai pas compris votre demande.");
			}
		} 
	}
	
	static void afficher(int[] tab) {
		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}

}
