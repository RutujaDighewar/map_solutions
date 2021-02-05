package com.solution;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class ConcurrentMapInProcess {

	public static void main(String[] args) {

		/*HashMap hm = new HashMap();

		hm.put("Pune", 12);
		hm.put("Solapur", 13);
		
		Set s=hm.keySet();                      //ConcurrentModificationException
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			hm.put("Nanded", 26);     
			Object obj=itr.next();
			System.out.println(obj);
		}
		*/
		
		ConcurrentHashMap cm=new ConcurrentHashMap();
		cm.put("Pune", 12);
		cm.put("Solapur", 13);
		
		Set s=cm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			cm.put("Nanded", 26);
			cm.put("Mumbai", 43);
			Object obj=itr.next();
			System.out.println(obj);
		}
		

	}
}