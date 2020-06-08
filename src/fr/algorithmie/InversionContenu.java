package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[array.length];
		for (int i=array.length-1, j=0; i>=0; i--, j++) {
			arrayCopy[j] = array[i];
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("");
		for (int i=0; i<arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
