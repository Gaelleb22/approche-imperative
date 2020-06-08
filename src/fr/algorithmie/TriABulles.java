package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		for (int i=0; i<array2.length; i++) {
	
			for(int j=1; j<array2.length; j++) {
				if(array2[j-1]>array2[j]) {
					int temporaire = array2[j-1];
					array2[j-1] = array2[j];
					array2[j]=temporaire;
				}
			}
		}
		
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
