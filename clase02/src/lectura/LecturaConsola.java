package lectura;

import java.util.Scanner;

public class LecturaConsola {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String apellido;

		System.out.println("Dime tu nombre Completo: ");

		nombre = teclado.next();

		System.out.println("Tu nombre es: " + nombre);

		System.out.println("Dime tu apellido Completo: ");
		teclado.nextLine();
		apellido = teclado.next();

		System.out.println("Tu apellido es:" + apellido);

	}
}
