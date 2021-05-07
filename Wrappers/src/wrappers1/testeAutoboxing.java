package wrappers1;

public class testeAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing
		short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 100L;
		Float num11 = 3.5f;
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//autounboxing
		int num13 = num9; //num9.intValue();
		
		//autoboxing em expressoes
		num9++;
		
		System.out.println(num9);
		
		//auto unboxing num9 -> autoboxing num13/num9 -> num14
		Integer num14 = num13/num9;
		
		//mau uso
		Double a1,b1,c1;
		a1 = 10.0;
		b1 = 12.2;
		c1 = 4.7;
		Double media = (a1 + b1 + c1) / 3;
		System.out.println(media);
		
		
	}

}
