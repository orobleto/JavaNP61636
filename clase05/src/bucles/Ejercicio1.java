package bucles;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Tengo un producto con X precio (58.36$) y necesito saber cuando superara el
		// valor de los 500 $ si tengo una inflacion mensual de 2 digitos aleatoria
		int mes = 0;
		float precioProducto = 58.36f;
		float precioFinalProducto = precioProducto;

		while (precioFinalProducto <= 500) {
			mes++;
			float inflacionMensual = (float) Math.random();
			// 80
			// precioFinalProducto = precioFinalProducto + (precioFinalProducto *
			// inflacionMensual);
			precioFinalProducto = precioFinalProducto * (1 + inflacionMensual);

			System.out.printf(
					"La inflación del mes " + mes + " fue de %.2f y el producto finalizó con un precio de %.2f $ \n",
					(inflacionMensual * 100), precioFinalProducto);

		}

		System.out.printf("El producto paso de %.2f $ a %.2f $ en %d meses", precioProducto, precioFinalProducto, mes);

	}
}
