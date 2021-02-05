package com.solution;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFastAndFailSafe {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add(123);
		list.add("abc");
		list.add(1000);
		list.add(1020);
		
		/*Iterator itr=list.iterator();
		while(itr.hasNext()) {
			list.add(300);                       //ConcurrentModificationException
			Object obj=itr.next();
			System.out.println(obj);
		}*/
		
      
		ListIterator itr=list.listIterator();
		while(itr.hasNext()) {
			itr.add("Hello");
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		System.out.println(list);
	}

}
