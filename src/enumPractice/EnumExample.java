package enumPractice;

enum Mobile {

	APPLE, SAMSUNG, HTC;
}

public class EnumExample {
	public static void main(String[] args) {
		
		//System.out.println(Mobile.APPLE);

		Mobile m = Mobile.SAMSUNG;
		
		switch(m) {
		
		case APPLE:
			System.out.println("Apple is best");
			break;
			
		case SAMSUNG:
			System.out.println("Samsung is way better");
		}
		
	}
}
