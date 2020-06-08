package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = new int[0];
		boolean b = array.length>=1 && array[0]==array[array.length-1] ? true : false;
		System.out.println(b);

	}

}
