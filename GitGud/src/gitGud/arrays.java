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
		
		teclea.close();

	}

}
