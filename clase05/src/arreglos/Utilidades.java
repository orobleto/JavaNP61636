package arreglos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Utilidades {
	public static void main(String[] args) {
		String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };

		String canedaMeses = Arrays.toString(meses);

		JOptionPane.showMessageDialog(null, canedaMeses);

	

		JOptionPane.showMessageDialog(null, Arrays.toString(meses));

		String[] primeros6Meses = Arrays.copyOf(meses, 12);

		JOptionPane.showMessageDialog(null, Arrays.toString(meses) + "\n" + Arrays.toString(primeros6Meses));

		String[] ultimos6Meses = Arrays.copyOfRange(meses, 0, 12);
		JOptionPane.showMessageDialog(null, Arrays.toString(meses) + "\n" + Arrays.toString(ultimos6Meses));

		Arrays.sort(meses);
		JOptionPane.showMessageDialog(null, Arrays.equals(primeros6Meses, meses));
		
	}
}
