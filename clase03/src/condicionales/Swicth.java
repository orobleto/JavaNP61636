package condicionales;

public class Swicth {
	public static void main(String[] args) {
		// 1000 se creo - 1100 se modifico 2000 no se pudo hacer la operacion 3000 error
		String codigoRespuesta = "1000";
		int edad = 18;
		if (codigoRespuesta == "1000") {
			System.out.println("Los datos se crearon satisfactoriamente");
		} else if (codigoRespuesta == "1100") {
			System.out.println("Se modificaron los datos satisfactoriamente");
		} else if (codigoRespuesta == "2000") { // (codigoRespuesta == "2000" && edad < 18)
			System.out.println("No se pudo realizar la operacion");
		} else {
			System.out.println("Error al conectarse a la AFIP");
		}
		System.out.println("***************Switch**************");
		switch (codigoRespuesta) {
		case "1000":
			System.out.println("Los datos se crearon satisfactoriamente");
			break;
		case "1100":
			System.out.println("Se modificaron los datos satisfactoriamente");
			break;
		case "2000":
			System.out.println("No se pudo realizar la operacion");
			break;
		default:
			System.out.println("Error al conectarse a la AFIP");
		}

	}
}
