package operadoresasignacion;

public class PrincipalAsignacion {

	public static void main(String[] args) {

		// puntos del partido de basquet
		int puntosBasquet;
		puntosBasquet = 0;

		// puntos = 50
		// puntosAnteriores = puntos; -> 50
		// puntos = puntosAnmteriores + 2;

		System.out.println("Puntos del Partido: " + puntosBasquet);

		puntosBasquet = puntosBasquet + 2;

		System.out.println("Puntos del Partido: (puntosBasquet + 2)" + puntosBasquet);

		puntosBasquet += 2;

		System.out.println("Puntos del Partido: (+= 2)" + puntosBasquet);

		puntosBasquet -= 2;

		System.out.println("Puntos del Partido: (-= 2)" + puntosBasquet);

		puntosBasquet *= 6;

		System.out.println("Puntos del Partido: (*= 6)" + puntosBasquet);

		puntosBasquet /= 2;

		System.out.println("Puntos del Partido: (/= 2)" + puntosBasquet);

		puntosBasquet %= 4;

		System.out.println("Puntos del Partido: (%= 4)" + puntosBasquet);

		System.out.println("******************************************");

		int puntosFultbol = 0;

		System.out.println("Puntos del Partido Futbol: " + puntosFultbol);

		puntosFultbol = puntosFultbol + 1;

		System.out.println("Puntos del Partido Futbol: (= puntosFultbol + 1)" + puntosFultbol);

		puntosFultbol += 1;

		System.out.println("Puntos del Partido Futbol: (+= 1)" + puntosFultbol);

		puntosFultbol++;

		System.out.println("Puntos del Partido Futbol: (++)" + puntosFultbol);

		puntosFultbol--;

		System.out.println("Puntos del Partido Futbol: (--)" + puntosFultbol);

		System.out.println("***********************************************");

		int pruebaIncremento = 0;

		System.out.println(pruebaIncremento);

		pruebaIncremento--; // --pruebaIncremento;

		System.out.println(pruebaIncremento);

		System.out.println(pruebaIncremento--);// --pruebaIncremento

		System.out.println(pruebaIncremento);

	}

}
