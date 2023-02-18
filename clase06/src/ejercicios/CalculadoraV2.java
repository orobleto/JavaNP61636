package ejercicios;

public class CalculadoraV2 {
	public static void main(String[] args) {
		System.out.println(operar(5l, 6l, '*'));
	}

	public static int operar(int a, int b, char operador) {
		int total = 0;
		switch (operador) {
		case '+':
			total = a + b;
			break;
		default:
			break;
		}
		return total;

	}

	public static long operar(long a, long b, char operador) {

		switch (operador) {
		case '+':
			return sumar(a, b);
		// return a + b;
		case '-':
			return restar(a, b);
		// return a - b;
		case '*':
			return multiplicar(a, b);
		// return a * b;
		case '/':
			return dividir(a, b);
		/*
		 * if (b == 0) { return 0; } return a / b;
		 */
		default:
			return 0;
		}
	}

	public static long sumar(long a, long b) {
		return a + b;
	}

	public static long restar(long a, long b) {
		return a - b;
	}

	public static long multiplicar(long a, long b) {
		return a * b;
	}

	public static long dividir(long a, long b) {
		return b == 0 ? 0 : a / b;
	}
	
	
	

}
