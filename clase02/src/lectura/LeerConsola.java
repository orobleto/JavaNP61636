package lectura;

import java.util.Scanner;

// java.lang
public class LeerConsola {
	public static void main(String[] args) {
		System.out.println("imprime en consola");
		String palabra;
		// objeto
		Scanner lectorTecladoConsola = new Scanner(System.in);

		System.out.println("Escribe algo: ");

		palabra = lectorTecladoConsola.nextLine();

		System.out.println("Escribiste lo siguiente: " + palabra);

		System.out.println("Dime tu edad: ");

		byte edad = lectorTecladoConsola.nextByte();

		System.out.println("Tu edad es : " + edad);

		System.out.println("Dime tu sueldo: ");

		float sueldo = lectorTecladoConsola.nextFloat();

		System.out.println("Tu sueldo es: " + sueldo);

		System.out.println("Dime si eres mayor de edad? ");
		boolean mayorEdad = lectorTecladoConsola.nextBoolean();

		System.out.println("Eres mayo de edad? " + mayorEdad);

		System.out.println("Dame la inicial de tu nombre: ");

		char inicalNombre = lectorTecladoConsola.next().charAt(0);// "O".charAt(0)

		System.out.println("La inicial de tu nombre es: " + inicalNombre);

		System.out.println("Escribe una despedida: ");
		
		lectorTecladoConsola.nextLine();// tomar el ultimo enter que nos molesta

		String despedida = lectorTecladoConsola.nextLine();

		System.out.println("Tu despedida fue: " + despedida);

	}
}
