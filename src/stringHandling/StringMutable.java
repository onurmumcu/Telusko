package stringHandling;


//StringBuffer ve StringBuilder cok benzer, ayni methodlar
//Always go with StringBuffer
//StringBuffer is thread-safe
//StringBuilder is not thread-safe


public class StringMutable {

	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Onur");
		sbf.append(" Mumcu");
		sbf.replace(0, 4, "Melis");
		sbf.delete(1, 4);
		
		
		System.out.println(sbf);
	}

}
