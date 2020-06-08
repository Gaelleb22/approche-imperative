package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ; 
		System.out.println("Veuillez entrer un nombre entre 1 et 10 :");
		int nb = scanner.nextInt();
		
		while (true) {
			if (nb<1 || nb>10) {
				System.out.println("Nombre incorrect !");
				System.out.println("Veuillez entrer un nombre entre 1 et 10 :");
				nb = scanner.nextInt();
			}
			else {
				System.out.println(nb);
				System.out.println("Fin du programme !");
				break;
			}
		} 
			
	}

}
