package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		int [] array = {0, 1, 2, 3, 4, 5, 6, 7};
		int temp = array[array.length-1];
		for (int i=array.length-1; i>0; i--) {
			array[i]=array[i-1];
		}
		array[0]=temp;
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
