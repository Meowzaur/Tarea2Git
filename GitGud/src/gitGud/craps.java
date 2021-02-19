package gitGud;

import java.util.Scanner;

public class craps {

	public static void main(String[] args) {

		double apuesta, dado1, dado2, suma, victoria = 0;
		boolean parar = false;
		
		Scanner teclea = new Scanner(System.in);
		
		System.out.print("¿Cuánto deseas apostar? ");
		apuesta = Double.parseDouble(teclea.nextLine());
		System.out.println("");
		
		dado1 = Math.floor(Math.random() * 6) + 1;
		dado2 = Math.floor(Math.random() * 6) + 1;
		suma = dado1 + dado2;
		System.out.println((int)dado1 + " y " + (int)dado2 + ", ¡" + (int)suma + "!");
		
		if (suma == 7 || suma == 11) {
			System.out.println("FELICIDADES: ganaste, y ahora tu apuesta se duplicó, de " + apuesta + " a " + apuesta*2 + ".");
			parar = true;
		} else if (suma == 2 || suma == 3 || suma == 12) {
			System.out.println("Ohh, qué lástima, has perdido.");
			parar = true;
		} else {
			victoria = suma;
			System.out.println("Número de salvación, ahora tienes que sacar un " + (int)victoria + " para ganar, o un 7 para perder.\n");
		}
		
		while (parar == false) {
			
			dado1 = Math.floor(Math.random() * 6) + 1;
			dado2 = Math.floor(Math.random() * 6) + 1;
			suma = dado1 + dado2;
			System.out.println((int)dado1 + " y " + (int)dado2 + ", ¡" + (int)suma + "!");
			
			if (suma == victoria) {
				System.out.println("FELICIDADES: ganaste, y ahora tu apuesta se duplicó, de " + apuesta + " a " + apuesta*2 + ".");
				parar = true;
			} else if (suma == 7) {
				System.out.println("Ohh, qué lástima, has perdido.");
				parar = true;
			} else {
				System.out.println("Número de salvación, repetimos la tirada.\n");
			}
			
		}
		
		teclea.close();		

	}

}
