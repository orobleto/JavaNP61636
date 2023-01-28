package condicionales;

public class IfAnidados {
	public static void main(String[] args) {
		// rangos Joven (hasta 17), adulto (18-60) adulto mayor (>60)
		int edad = 15;

		if (edad >= 18 && edad <= 60) {
			System.out.println("Adulto");
		} else if (edad > 60) {
			System.out.println("Adulto Mayor");
		} else {
			System.out.println("Joven");
		}

		if (edad >= 18) {
			if (edad > 60) {
				System.out.println("Adulto mayor");
			} else {
				System.out.println("Adulto");
			}
		} else {
			System.out.println("Joven");
		}

	}
}
