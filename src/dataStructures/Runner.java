package dataStructures;

import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		
		for(int i= 0; i<10; i ++) {
			list.add(i);
			
		}
		
		list.add(5);
		
		System.out.println(list.toString());
	}

}
