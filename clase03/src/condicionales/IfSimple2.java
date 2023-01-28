package condicionales;

public class IfSimple2 {
	public static void main(String[] args) {
		System.out.println("Inicio de la Aplicacion");
		String colorCabello = "Rojo";
		String diaSemana = "Viernes";
		byte edad = 18;

		if (colorCabello == "Rojo" && diaSemana == "Jueves" && edad >= 18) {
			System.out.println("BigMac con descuento");
			System.out.println("Felicitaciones");
			System.out.println("..............");
		}
		// !true -> false ...... !false -> true
		if (!(colorCabello == "Rojo" && diaSemana == "Jueves" && edad >= 18)) {
			System.out.println("No tienes el descuento");
			System.out.println(":(");
			System.out.println("..............");
		}

		if (colorCabello != "Rojo" || diaSemana != "Jueves" || edad < 18) {
			System.out.println("No tienes el descuento V2");
			System.out.println(":(");
			System.out.println("..............");
		}

		System.out.println("Fin de la Aplicacion");
	}
}
