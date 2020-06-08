package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nbBatons = 21;
		
			
		System.out.println("Il y a 21 B�tons, vous pouvez en s�lectionner 1, 2 ou 3 � chaque tour. Le premier qui arrive � 0 � perdu.");
		System.out.println("D�but de la partie !");
		
		Random random = new Random();
        int nombreAleatoire = random.nextInt(3);
        
        if (nombreAleatoire == 0) {
        	System.out.println("� vous de commencer : ");
        }
        else {
        	System.out.println(nombreAleatoire);
        	nbBatons -= nombreAleatoire;
        	System.out.println("Il reste "+nbBatons+" en jeu.");
        }
        	
        boolean finDePartie = false;
        while (!finDePartie) {
        
        	// Au tour du joueur
        	System.out.println("� vous de jouer ! Nombre de b�tons s�lectionn�s : ");
        	int nb = scanner.nextInt();
        	if (nb<=0 || nb > 3) {
        		System.out.println("Vous devez choisir 1, 2 ou 3. On ne triche pas s'il-vous-plait.");
        		nb = scanner.nextInt();
	        }
	        nbBatons -= nb;
	        System.out.println("Il reste "+nbBatons+" en jeu.");
	        	
	        if (nbBatons == 0) {
	        	System.out.println("Vous avez Predu !");
	        	finDePartie = true;
	        }
	        	
	        	
        	
        	// Au tour de l'ordinateur
        	System.out.println("C'est au tour de votre adversaire.");
        	nombreAleatoire = random.nextInt(3);
        	if (nombreAleatoire == 0) {
        		nombreAleatoire = 1;
        	}
        	else if (nombreAleatoire>nbBatons) {
        		nombreAleatoire = nbBatons;
        	}
        	
        	System.out.println(nombreAleatoire);
        	nbBatons -= nombreAleatoire;
        	System.out.println("Il reste "+nbBatons+" en jeu.");
        		
        	if (nbBatons == 0) {
	        	System.out.println("Vous avez Gagn� !");
	        	finDePartie = true;
        	}
        		
        		
		}

	}

}
