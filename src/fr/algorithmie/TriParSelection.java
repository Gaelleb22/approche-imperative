package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		for (int i=0; i<array2.length-1; i++) {
			int indexMin=i;
			for(int j=i+1; j<array2.length; j++) {
				if(array2[j]<array2[indexMin]) {
					indexMin=j;
				}
			}
			int min = array2[indexMin];
			array2[indexMin] = array2[i];
			array2[i] = min;
		}
		
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}

	}

}
