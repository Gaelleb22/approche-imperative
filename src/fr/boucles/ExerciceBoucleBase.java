package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		for (int i=1; i<11; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
		String nom = "Brossas";
		String prenom = "Gaëlle";
		for (int i=0; i<20; i++) {
			System.out.println(nom+" "+prenom);
		}
		
		System.out.println("");
		for (int i=0; i<101; i++) {
			System.out.println(i++);
		}
		
		System.out.println("");
		for (int i=1; i<100; i++) {
			System.out.println(i++);
		}

	}

}
