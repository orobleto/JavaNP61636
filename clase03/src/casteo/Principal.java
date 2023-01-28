package casteo;

public class Principal {
	public static void main(String[] args) {
		// Casteo Implicito

		byte myByte1 = 100;// 18
		short myShort1 = myByte1;// 18
		int myInt = myShort1;// 18
		long myLong = myInt;// 18
		float myFloat = myLong;// 18
		double myDouble = myFloat;// 15

		System.out.println(myDouble);

		// Casteo Explicito
		double myDouble2 = 109258965.03698422222222222222;
		float myFloat2 = (float) myDouble2;
		long myLong2 = (long) myDouble2;
		int myInt2 = (int) myDouble2;
		short myShort2 = (short) myDouble2;
		byte myByte2 = (byte) myDouble2;
		System.out.println(myDouble2);
		System.out.println(myFloat2);
		System.out.println(myShort2);
		System.out.println(myByte2);
		byte mybyte = 127;
		System.out.println(mybyte);
		mybyte++;
		System.out.println(mybyte);

		// Envoltorio
		String cadena = "269.369";
		double myDouble3 = Double.parseDouble(cadena);
			 //myDouble3 = Double.valueOf(cadena);
		float myFloat3 = Float.parseFloat(cadena);
		long myLong3 = Long.parseLong(cadena);
		int myInt3 = Integer.parseInt(cadena);
		short myShort3 = Short.parseShort(cadena);
		byte myByte3 = Byte.parseByte(cadena);

		boolean recibirNotificaciones = Boolean.parseBoolean("true");
		char caracter = cadena.charAt(1);
		System.out.println(myDouble3);

	}
}
