package condicionales;

public class BloquesCondicionales {
	public static void main(String[] args) {
		System.out.println("Inicio");
		int edad = 15;

		if (edad >= 18)
			System.out.println("adulto");
		else {
			System.out.println("menor");
			System.out.println(".......");
		}

		System.out.println("Fin");
	}
}
