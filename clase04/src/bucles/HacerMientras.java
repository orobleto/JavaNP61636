package bucles;

import java.util.Scanner;

public class HacerMientras {
	public static void main(String[] args) {

		System.out.println("Inicio del Programa");
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		int cantidad = 0;
		int total = 1;
		boolean valorCorrecto;

		do {
			System.out.println("Los valores introducidos deben ser mayor o igual a cero");
			System.out.print("A que exponente quieres elevar el 2: ");
			cantidad = teclado.nextInt();
			valorCorrecto = cantidad >= 0;
		} while (!valorCorrecto);

		teclado.close();

		// 2
		// while (contador < (cantidad - 1)) {
		while (contador < cantidad) {
			total = total * 2;
			contador++;
		}

		// System.out.println(Math.pow(2, cantidad));
		System.out.println("El valor dio: " + total);

		System.out.println("Fin del Programa");
	}
}
