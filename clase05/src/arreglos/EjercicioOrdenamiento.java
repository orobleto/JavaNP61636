package arreglos;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class EjercicioOrdenamiento {
	public static void main(String[] args) {
		// sistema de notas

		float[] notas;
		int cantidadNotas;

		/*
		 * String cadenaCantidadNotas =
		 * JOptionPane.showInputDialog("Indica cuantas notas vas a ingresar");
		 * cantidadNotas = Integer.parseInt(cadenaCantidadNotas);
		 */

		cantidadNotas = Integer.parseInt(JOptionPane.showInputDialog("Indica cuantas notas vas a ingresar:"));

		notas = new float[cantidadNotas];

		for (int i = 0; i < notas.length; i++) {
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Indica la nota[" + (i + 1) + "]:"));
		}

		JOptionPane.showMessageDialog(null, Arrays.toString(notas));
		Arrays.sort(notas);
		JOptionPane.showMessageDialog(null, Arrays.toString(notas));
	}
}
