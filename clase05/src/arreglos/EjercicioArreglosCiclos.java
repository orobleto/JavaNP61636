package arreglos;

public class EjercicioArreglosCiclos {
	public static void main(String[] args) {
		String[] cursos = { "Java - NP", "Java - SE", "Java - Spring", "Base de Datos", "Python", "Java - Web API" };

		for (int i = 0; i < cursos.length; i++) {
			String curso = cursos[i];
			System.out.println(curso);

			if (!curso.contains("Java")) {
				continue;
			}

			if (curso.contains("Web")) {
				break;
			}
			System.out.println("Inscribirme en " + curso);

		}

		System.out.println("*****************************************");
		for (int i = 0; i < cursos.length; i++) {

			System.out.println(cursos[i]);

			if (!cursos[i].contains("Java")) {
				continue;
			}

			if (cursos[i].contains("Web")) {
				break;
			}
			System.out.println("Inscribirme en " + cursos[i]);

		}

	}
}
