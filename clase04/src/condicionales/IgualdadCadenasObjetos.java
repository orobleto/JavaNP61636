package condicionales;

import java.util.Scanner;

public class IgualdadCadenasObjetos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un color: ");
		String color1 = teclado.next();

		System.out.print("Escribe otro color: ");
		String color2 = teclado.next();

		teclado.close();

		System.out.printf("Color1: %s , Color2: %s , Color3 %s", color1, color2, "violeta");
		System.out.println();

		System.out.println(color1 + " " + color2 + " " + color1);

		System.out.println(String.format("%1$s %2$s %1$s", color1, color2));

		System.out.println();
		System.out.println(color1 == color2);

		System.out.println(color1.equals(color2));

		System.out.println(color2.equalsIgnoreCase(color1));
	}
}
