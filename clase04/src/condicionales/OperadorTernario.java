package condicionales;

public class OperadorTernario {
	public static void main(String[] args) {
		byte edad = 15;
		boolean mayorEdad;

		// mayorEdad = (edad > 17) ? true : false;
		mayorEdad = edad > 17;
		
		String mensaje = "La persona es mayor de edad? " + (mayorEdad ? "Si" : "No");

		System.out.println(mensaje);

		//System.out.println((mayorEdad) ? "La Persona es mayor de edad" : "La persona No es mayor de edad");

		/*
		 * if (mayorEdad) { System.out.println("La persona es mayor de edad"); } else {
		 * System.out.println("La persona No es mayor de edad"); }
		 * 
		 */

		/*
		 * if (edad >= 18) { mayorEdad = true; } else { mayorEdad = false; }
		 */

	}

}
