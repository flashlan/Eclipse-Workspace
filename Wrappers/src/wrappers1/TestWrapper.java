package wrappers1;

public class TestWrapper {

	public static void main(String[] args) {

		//wrappers representam os tipos primitivos do java
		//tipos primitivos:
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000L;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';
		
		//declarando classe Short com construtor
		Short num7 = new Short(num1); // num1 ou passar o numero 1 propriamente, mas fazendo cast ((short) 1)
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000L);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.55555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("10000");
		
		Double num14 = new Double(3.5); //3,5 para locale pt-br
		
		
		//classes wrappers possibilitam a conversao de tipos
		System.out.println(num13.intValue());
		System.out.println(num13.doubleValue());
		
		Long num15 = num13.longValue();
		
		//parser de string para primitivos
		int num16 = Integer.parseInt("10000");
		System.out.println("parse string to int: " + num16);
		
		//transforma int em instancia de classe integer com valueof
		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);
		
		// operador == nao funciona com wrapper
		System.out.println(num9 == num13);
		
	}

}
;
