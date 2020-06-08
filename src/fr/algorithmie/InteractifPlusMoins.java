package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
        int nombreAleatoire = random.nextInt(100);
        
        if (nombreAleatoire == 0) {
        	nombreAleatoire = 1;
        }
        
        System.out.println("Devinez le nombre al�atoire entre 1 et 100 :");
        int nb = scanner.nextInt();
        int nbDeCoup = 1;
        while (true) {
        	if (nb>nombreAleatoire) {
        		System.out.println("Votre nombre est supp�rieur au nombre al�atoire ! Essayez encore !");
        		nb = scanner.nextInt();
        		nbDeCoup += 1;
        	}
        	else if (nb < nombreAleatoire) {
        		System.out.println("Votre nombre est inf�rieur au nombre al�atoire ! Essayez encore !");
        		nb = scanner.nextInt();
        		nbDeCoup += 1;
        	}
        	else {
        		System.out.println("Bravo, vous avez trouv� en " + nbDeCoup + " coups !");
        		break;
        	}
        }
	}

}
