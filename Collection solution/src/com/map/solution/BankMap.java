package com.map.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class BankMap {

	public static void main(String[] args) {

		List pune= new ArrayList();
	     pune.add("Karve nagar branch");
		pune.add("Kothrud branch");
		
		List navimumbai = new ArrayList();
		navimumbai.add("Sanpada branch");
		navimumbai.add("ulwe branch");
		
		HashMap sbi = new HashMap();
		sbi.put("Pune", pune);
		sbi.put("Navi Mumbai", navimumbai);
		
		List solapur=new ArrayList();
		solapur.add("murarji peth branch");
		
		List nagpur = new ArrayList();
		nagpur.add("sitabuldi branch");
		
		HashMap bom= new HashMap();
		bom.put("Solapur", solapur);
		bom.put("Nagpur", nagpur);
		
		HashMap rbi = new HashMap();
		rbi.put("STATE BANK OF INDIA", sbi);
		rbi.put("BANK OF MAHARASHTRA", bom);
		
       HashMap worldbank = new HashMap();
       worldbank.put("RESERVE BANK OF INDIA" ,rbi);
       
       
        Set bank=worldbank.keySet();
        for(Object obj :  bank) {
        	String Key=(String) obj;
        	System.out.println(Key);
        	HashMap Banks = (HashMap) worldbank.get(Key);
        	Set setOfBanks=Banks.keySet();
        	for(Object ob : setOfBanks) {
        		String bankKey =(String) ob;
        		System.out.println("\t:-"+bankKey);
        		HashMap cities =(HashMap) Banks.get(bankKey);
        		Set setOfCities = cities.keySet();
        		for(Object o : setOfCities) {
        			String citiesKey=(String) o;
        			System.out.println("\t\t->"+citiesKey);
        			List branch=(List) cities.get(citiesKey);
        		   for(Object o1 : branch) {
        			   String setOfBranch=(String) o1;
        			   System.out.println("\t\t\t-"+setOfBranch);
        		   }	
        		}
        		
        	}
        }
       
	}

}
