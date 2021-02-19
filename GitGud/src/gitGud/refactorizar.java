package gitGud;

import java.util.Scanner;

public class refactorizar {

	public static void main(String[] args) {

		Scanner teclea = new Scanner(System.in);

		double saldo = 0;
		int opcion = 0;
		double cantidad = 0;

		System.out.println("Escribe tu saldo");

		saldo = teclea.nextDouble();

		while (opcion != 4) {

			System.out.println("Escribe el número de tu opción\n" + "\n" + "1. Mostrar saldo\n" + "2. Sumar saldo\n"
					+ "3. Restar saldo\n" + "4. Salir");

			opcion = teclea.nextInt();

			String saldoActual = "Tu saldo actual es ";
			switch (opcion) {
			case 1:
				System.out.println("tu saldo es de " + saldo);
				if (saldo < 1000) {
					System.out.println("Sos pobre");
				}
				if (saldo > 200000) {
					System.out.println("Das ajco");
				}
				break;
			case 2:
				System.out.println("Introduce el saldo a sumar");
				cantidad = teclea.nextDouble();
				saldo = saldo + cantidad;
				System.out.println(saldoActual + saldo);
				break;
			case 3:
				System.out.println("Introduce el saldo a restar");
				cantidad = teclea.nextDouble();
				saldo = saldo - cantidad;
				System.out.println(saldoActual + saldo);
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Pruebe otro número");

			}

		}
		
		teclea.close();

	}

}
