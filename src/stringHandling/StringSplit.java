package stringHandling;

public class StringSplit {

	public static void main(String[] args) {

		String str = "onur,melis,oso,badem,zeytin";

		// System.out.println(str.split(",")); Calismiyor
		String names[] = str.split(",");
		for (String val : names) {
			System.out.println(val);
		}
	}

}
