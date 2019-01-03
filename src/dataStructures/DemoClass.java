package dataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass {
public static void main(String[] args) {
	int values[] = new int[4];
	Object values1[] = new Object[4];
	values1[0] = "onur";
	values1[1] = 7;
	
	Collection<Integer> deger = new ArrayList();
	//deger.add("onur");
	//deger.add( 5.8f);
	deger.add(3);
	deger.add(22);
	deger.add(666);
	
	
	
	
	//Iterator i = deger.iterator();
	
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
	
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
	
	for(Object i : deger) {
		System.out.println(i);
	}
	
}
	
}
