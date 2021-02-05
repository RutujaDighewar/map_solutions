package com.map.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapSolution1 {

	public static void main(String[] args) {

		List pune = new ArrayList();
		pune.add("KarveNagar");

		List mumbai = new ArrayList();
		mumbai.add("thane");

		HashMap mh = new HashMap();
		mh.put("Pune", pune);
		mh.put("Mumbai", mumbai);

		List patna = new ArrayList();
		patna.add("Aavalahalli");
		patna.add("Bariatu");

		HashMap bihar = new HashMap();
		bihar.put("Patna", patna);

		HashMap india = new HashMap();
		india.put("Maharashtra", mh);
		india.put("Bihar", bihar);

		HashMap world = new HashMap();
		world.put("India", india);

		Set setOfCountry = world.keySet();
		for (Object obj : setOfCountry) {
			String countriesKey = (String) obj;
			System.out.println(countriesKey);
			HashMap states = (HashMap) world.get(countriesKey);

			Set setOfStates = states.keySet();
			for (Object ob : setOfStates) {
				String statesKey = (String) ob;
				System.out.println("\t:-" + statesKey);
				HashMap cities = (HashMap) states.get(statesKey);

				Set setOfCities = cities.keySet();
				for (Object o : setOfCities) {
					String citiesKey = (String) o;
					System.out.println("\t\t->" + citiesKey);
					List locations = (List) cities.get(citiesKey);

					for (Object objt : locations) {
						String location = (String) objt;
						System.out.println("\t\t\t-" + location);
					}
				}

			}

		}
	}

}
