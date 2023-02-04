package bucles;

import java.util.Scanner;

public class Mientras2 {
	public static void main(String[] args) {

		System.out.println("Inicio del Programa");
		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		int cantidad = 0;
		int total = 2;
		boolean valorCorrecto = false;

		while (!valorCorrecto) {// true
			System.out.println("Los valores introducidos deben ser mayor a 0...");
			System.out.print("A que exponente quieres elevar el 2: ");
			cantidad = teclado.nextInt();

			valorCorrecto = cantidad > 0;
		}

		teclado.close();

		// 2
		// while (contador < (cantidad - 1)) {
		while (contador < cantidad) {
			total = total * 2;
			contador++;
		}

		System.out.println(Math.pow(2, cantidad));
		System.out.println("El valor dio: " + total);

		System.out.println("Fin del Programa");

	}
}
