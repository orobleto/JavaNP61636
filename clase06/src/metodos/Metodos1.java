package metodos;

import javax.swing.JOptionPane;

public class Metodos1 {
	public static void main(String[] args) {

		String cadenaAuxiliar = "octavio robleto";
		System.out.println(estaVacia(cadenaAuxiliar));
		System.out.println(convertirMayuscula(cadenaAuxiliar));

		// crear un Color RGB aleatorio
		// RGB (0-255,0-255,0-255)

		int red;
		int blue;
		int green;

		red = intensidad();// 153
		blue = intensidad();
		green = intensidad();

		System.out.println("RGB(" + red + "," + green + "," + blue + ")");

		System.out.println("RGB(" + intensidad() + "," + intensidad() + "," + intensidad() + ")");

		String mensajeAuxiliar = "Hola desde una variable";
		int cantidadRep = 5;
		imprimir(mensajeAuxiliar, cantidadRep);
		imprimir();
		imprimir("Hola desde el literal enviado", cantidadRep);
		imprimir();
		imprimir("otro mensaje", 8);

		System.out.println(aleatorio(999));

		System.out.println("Fin del programa");
	}

	// metodos de tipo procedimiento (void) - > no retornan nada
	public static void imprimir() {
		JOptionPane.showMessageDialog(null, "Hola mundo desde imprimir");
	}

	public static void imprimir(String mensaje, int cantidadRepeticiones) { // parametro(s)

		for (int i = 0; i < cantidadRepeticiones; i++) {
			System.out.println("Rep " + i + ": " + mensaje);

		}
		if (cantidadRepeticiones == 5) {
			return;
		}

		System.out.println("*****************fin de la operacion impimir");

	}

	// Metodos de tipo funcion son aquellos que retonan algo (primitivos y objetos)
	//
	public static short intensidad() {
		// algoritmo
		/*
		 * short intensidad =(short) (Math.random() * 255);
		 * 
		 * return intensidad;
		 */

		return (short) ((Math.random() * 256));// 153
	}

	// byte - short - int - long - float - double - String
	public static int aleatorio(int numeroMaximo) {
		return (int) (Math.random() * numeroMaximo);
	}

	// ""
	public static boolean estaVacia(String cadena) {
		// return (cadena == null || cadena.length() == 0) ? true : false;
		return (cadena == null || cadena.length() == 0);
	}

	public static String convertirMayuscula(String cadena) {
		return estaVacia(cadena) ? cadena : cadena.toUpperCase();
	}

}
