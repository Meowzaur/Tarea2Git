package gitGud;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		Scanner teclea = new Scanner(System.in);

		int array[] = new int[3];
		int x;
		
		System.out.println("Teclea 3 números a utilizar:");
		array[0] = teclea.nextInt();
		array[1] = teclea.nextInt();
		array[2] = teclea.nextInt();
		
		x = array[2] - array[0] - array[1];
		System.out.println("El resultado es: " + x);
		
		x = array[0] + array[1] + array[2];
		System.out.println("La suma es: " + x);
		
		teclea.close();

	}

}
