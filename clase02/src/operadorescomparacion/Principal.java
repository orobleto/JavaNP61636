package operadorescomparacion;

public class Principal {
	public static void main(String[] args) {

		int puntosArgentina = 1;
		int puntosFrancia = 1;

		System.out.println("Puntos Partido \t\t\t\t\t: Respuesta");
		System.out.println("***********************************************************");
		System.out.println("puntosArgentina (" + puntosArgentina + ") == puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina == puntosFrancia));

		puntosArgentina++;

		System.out.println("puntosArgentina (" + puntosArgentina + ") > puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina > puntosFrancia));

		puntosFrancia++;

		System.out.println("puntosArgentina (" + puntosArgentina + ") > puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina > puntosFrancia));

		System.out.println("puntosArgentina (" + puntosArgentina + ") >= puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina >= puntosFrancia));

		System.out.println("puntosArgentina (" + puntosArgentina + ") < puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina < puntosFrancia));

		System.out.println("puntosArgentina (" + puntosArgentina + ") <= puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina <= puntosFrancia));

		puntosArgentina++;

		System.out.println("puntosArgentina (" + puntosArgentina + ") != puntosFrancia (" + puntosFrancia + ") \t: "
				+ (puntosArgentina != puntosFrancia));

	}
}
