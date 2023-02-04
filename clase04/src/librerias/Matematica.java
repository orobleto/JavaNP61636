package librerias;

class Matematica {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.floor(2.36));
		System.out.println(Math.ceil(2.36));
		System.out.println(Math.round(2.36));

		System.out.println(Math.floor(2.66));
		System.out.println(Math.ceil(2.66));
		System.out.println(Math.round(2.66));
		System.out.println("*******************");
		double aleatorio = Math.random();
		System.out.println(aleatorio);

		aleatorio *= 100;
		System.out.println(aleatorio);

		aleatorio = Math.ceil(aleatorio);
		System.out.println(aleatorio);

		byte numero = (byte) (aleatorio);
		System.out.println(numero);
	}
}
