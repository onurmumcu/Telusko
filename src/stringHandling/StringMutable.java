package stringHandling;

public class StringMutable {

	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Onur");
		sbf.append(" Mumcu");
		sbf.replace(0, 4, "Melis");
		sbf.delete(1, 4);
		
		
		System.out.println(sbf);
	}

}
