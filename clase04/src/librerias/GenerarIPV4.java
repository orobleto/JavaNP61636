package librerias;

public class GenerarIPV4 {
	public static void main(String[] args) {
		short seg1 = (short) Math.floor(Math.random() * 256);
		short seg2 = (short) Math.floor(Math.random() * 256);
		short seg3 = (short) Math.floor(Math.random() * 256);
		short seg4 = (short) Math.floor(Math.random() * 256);
		String IP = String.format("%s.%s.%s.%s", seg1, seg2, seg3, seg4);
		System.out.println(IP);
		System.out.printf("%s.%s.%s.%s", seg1, seg2, seg3, seg4);
		System.out.println();
		System.out.println(seg1 + "." + seg2 + "." + seg3 + "." + seg4);

		/*
		 * boolean numeroValido; short ip = 0; do { double aleatorio = Math.random(); ip
		 * = (short) (aleatorio * 1000); System.out.println(aleatorio + "->" + ip);
		 * numeroValido = ip <= 255;
		 * 
		 * } while (!numeroValido);
		 * 
		 * System.out.println("IP Valida: " + ip);
		 */
	}
}
