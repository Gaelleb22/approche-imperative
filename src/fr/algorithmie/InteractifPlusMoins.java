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
        
        System.out.println("Devinez le nombre aléatoire entre 1 et 100 :");
        int nb = scanner.nextInt();
        int nbDeCoup = 1;
        while (true) {
        	if (nb>nombreAleatoire) {
        		System.out.println("Votre nombre est suppérieur au nombre aléatoire ! Essayez encore !");
        		nb = scanner.nextInt();
        		nbDeCoup += 1;
        	}
        	else if (nb < nombreAleatoire) {
        		System.out.println("Votre nombre est inférieur au nombre aléatoire ! Essayez encore !");
        		nb = scanner.nextInt();
        		nbDeCoup += 1;
        	}
        	else {
        		System.out.println("Bravo, vous avez trouvé en " + nbDeCoup + " coups !");
        		break;
        	}
        }
	}

}
