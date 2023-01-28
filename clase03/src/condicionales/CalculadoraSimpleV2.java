package condicionales;

import java.util.Scanner;

public class CalculadoraSimpleV2 {
	public static void main(String[] args) {
		System.out.println("Calculadora v2");
		// declarar variables y constantes
		float numero1;
		float numero2;
		float total = 0;
		char operador;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Indique el primer numero: ");
		numero1 = teclado.nextFloat();

		System.out.print("Indique la operacion matematica [ + (s), - (r) , * (m), / (d) ]: ");
		operador = teclado.next().charAt(0);

		System.out.print("Indique el segundo numero: ");
		numero2 = teclado.nextFloat();

		switch (operador) {
		case 's':
		case '+':
			total = numero1 + numero2;
			break;
		case 'r':
		case '-':
			total = numero1 - numero2;
			break;
		case 'm':
		case '*':
			total = numero1 * numero2;
			break;
		case 'd':
		case '/':
			if (numero2 == 0)
				System.out.println("No se puede dividir por cero");
			else
				total = numero1 / numero2;
			break;
		default:
			System.out.println("(" + operador + ") No es un operador valido ");
		}

		System.out.println("La operacion dio como resultado " + total);

		System.out.println("Fin");
	}
}
