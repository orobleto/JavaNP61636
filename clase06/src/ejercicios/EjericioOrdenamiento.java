package ejercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class EjericioOrdenamiento {
	public static void main(String[] args) {
		// ordenamiento de notas de mayor a menor
		float[] notas;
		String[] nombres;
		int cantidadNotas;

		// recibimos la cantidad de notas
		// notas = new float[Integer.parseInt(JOptionPane.showInputDialog("Indica la
		// cantidad de notas a ingresar: "))];
		cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Indica la cantidad de notas a ingresar: "));

		// inicializamos nuestro arreglo
		notas = new float[cantidadNotas];
		nombres = new String[cantidadNotas];

		// un ciclo para pedir los datos
		for (int i = 0; i < notas.length; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre del alumno: ");
			notas[i] = Float.parseFloat(
					JOptionPane.showInputDialog("Ingresa la nota[" + (i + 1) + "] de " + nombres[i] + ": "));
		}

		// ordenamiento, buscar un dato en especifico

		// 3 2 5 4 -> 2 4 5 3
		for (int i = 0; i < notas.length; i++) {
			// pares izquierdo
			/*
			 * if (notas[i] % 2 == 0) { continue; }
			 */
			for (int j = i; j < notas.length; j++) {
				String mensaje = Arrays.toString(nombres) + "\n" + Arrays.toString(notas) + "\nI(" + i + "):" + notas[i]
						+ " - J(" + j + "):" + notas[j];

				// if (notas[j] % 2 == 0) {
				if (notas[i] > notas[j]) {
					// intercambiar las notas
					float notaAux = notas[i];// 3
					notas[i] = notas[j];
					notas[j] = notaAux;

					// intercambiamos nombres
					String nombreAux = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = nombreAux;

					mensaje += "\n intercambio";
				}
				JOptionPane.showMessageDialog(null, mensaje);

			}
		}

		JOptionPane.showMessageDialog(null,
				"<html><body>Notas del <b>Sistema</b> <br>" + Arrays.toString(notas) + "</body></html>");

	}
}
