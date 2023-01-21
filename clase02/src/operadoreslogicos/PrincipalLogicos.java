package operadoreslogicos;

public class PrincipalLogicos {
	public static void main(String[] args) {

		// mis padres me regalar un telefono me preguntan que quieres?
		// un Iphone y que sea Rojo

		boolean iphone;
		boolean rojo;

		// tienda 1
		iphone = true;
		rojo = true;
		System.out.println("es Iphone y es Rojo, me lo compran? " + (iphone && rojo));

		// tienda 2
		iphone = false; // Xiaomi
		rojo = true;

		System.out.println("es Xiaomi y es Rojo, me lo compran? " + (iphone && rojo));

		// tienda 3
		iphone = true;
		rojo = false; // azul

		System.out.println("es iPhone y es Azul, me lo compran? " + (iphone && rojo));

		iphone = false; // Samsung
		rojo = false; // azul

		System.out.println("es Samsung y es Verde, me lo compran? " + (iphone && rojo));

		String telefono = "Azul";
		String color = "Rojo";

		System.out.println((telefono == "iPhone") && (color == "Rojo"));

		System.out.println((telefono == "iPhone") & (color == "Rojo"));

		// mis padres me regalar un telefono me preguntan que quieres?
		// un Iphone o que sea Rojo
		System.out.println("***************************************");
		// tienda 1
		iphone = true;
		rojo = true;
		System.out.println("es Iphone y es Rojo, me lo compran? " + (iphone || rojo));

		// tienda 2
		iphone = false; // Xiaomi
		rojo = true;
		System.out.println("es Xiaomi y es Rojo, me lo compran? " + (iphone || rojo));

		// tienda 3
		iphone = true;
		rojo = false; // azul
		System.out.println("es Iphone y es Azul, me lo compran? " + (iphone || rojo));

		// tienda 4
		iphone = false; // Samsung
		rojo = false; // azul
		System.out.println("es Samsung y es Azul, me lo compran? " + (iphone || rojo));

		// todos las personas que tengan tipo documento DNI y LE

		String tipoDocumento = "PAS";

		System.out.println(tipoDocumento == "DNI" || tipoDocumento == "LE");

		// Negar
		System.out.println(!true);
		System.out.println(!false);

		String telefono1 = "iPhone";
		String colorTelefono1 = "Rojo";
		
		String telefono2 = "Xiaomi";
		String colorTelefono2 = "Azul";

		String opcionTiendaTelefono = "Sony";
		String opcionTiendaColor = "Azul";
		System.out.println("----------------------------------");
		System.out.println((telefono1 == opcionTiendaTelefono && colorTelefono1 == opcionTiendaColor)
				|| (telefono2 == opcionTiendaTelefono && colorTelefono2 == opcionTiendaColor));

	}

}
