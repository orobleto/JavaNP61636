package arreglos;

public class Unidimesional {

	public static void main(String[] args) {

		String meses[] = { "Ene", "Feb" };

		int[] edades;// int[] edades = new int[4];
		edades = new int[93];
		int edad;
		edad = 5;
		edades[0] = 6;
		edades[2] = 8;

		System.out.println(edad);
		System.out.println(edades[2]);
		int num1 = edad;
		int num2 = edades[0];

		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);
		System.out.println(edades[3]);
		System.out.println("******************************");
		
		for (int indice = 0; indice < edades.length; indice++) {
			System.out.println(edades[indice]);
		}

	}

}
