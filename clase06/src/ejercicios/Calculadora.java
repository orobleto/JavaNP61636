package ejercicios;

public class Calculadora {
	public static void main(String[] args) {

		sumar(0.9f, 6.3f);
		sumar(3l, 5l);
		sumar(1, 2);

	}

	/**
	 * Suma dos numeros enteros y los imprime en la consola
	 * 
	 * @param numero1 entero
	 * @param numero2 entero
	 */
	public static void sumar(int numero1, int numero2) {
		System.out.println("La sumai es: " + (numero1 + numero2));
	}

	public static void sumar(long numero1, long numero2) {
		System.out.println("La sumal es: " + (numero1 + numero2));
	}

	public static void sumar(float numero1, float numero2) {
		System.out.println("La sumaf es: " + (numero1 + numero2));
	}

}
