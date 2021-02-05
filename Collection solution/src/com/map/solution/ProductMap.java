package com.map.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ProductMap {

	public static void main(String[] args) {

		List we = new ArrayList();
		we.add("RED");

		List biba = new ArrayList();
		biba.add("White");

		HashMap kurta = new HashMap();
		kurta.put("We", we);
		kurta.put("Biba", biba);

		List samsung = new ArrayList();
		samsung.add("Black");
		samsung.add("Blue");

		HashMap mobile = new HashMap();
		mobile.put("Samsung", samsung);

		HashMap product = new HashMap();
		product.put("Kurta", kurta);
		product.put("Mobile", mobile);

		HashMap pro = new HashMap();
		pro.put("Product", product);

		Set setOfProducts = pro.keySet();
		for (Object obj : setOfProducts) {
			String productKey = (String) obj;
			System.out.println(productKey);
			HashMap products = (HashMap) pro.get(productKey);

			Set setOfProductType = products.keySet();
			for (Object ob : setOfProductType) {
				String productType = (String) ob;
				System.out.println("\t:-" + productType);
				HashMap brand = (HashMap) products.get(productType);
				
				Set setOfBrand = brand.keySet();
				for(Object o : setOfBrand) {
					String brandKey =(String) o;
					System.out.println("\t\t->"+brandKey);
					List color= (List) brand.get(brandKey);
					
				    for(Object oo : color) {
				    	String setOfColor = (String) oo;
				    	System.out.println("\t\t\t-"+setOfColor);
				    }
					
						
					}
				}
			}
		}

	}


