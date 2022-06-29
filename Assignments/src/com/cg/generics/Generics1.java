//2]write an application to hold 10 random int values as keys and 10 random double values as values for a hashmap.
//print the hashmap. print the data store in the hashmap.note:keys can only be int and values double

package com.cg.generics;

import java.util.HashMap;

public class Generics1 {
	
	public static void main(String[] args)
			{
					HashMap<Integer , Double> map = new HashMap<>();
	
				map.put(10,(double) 5.5);
				map.put(30 ,(double)5.6);
				map.put(20,(double)5.7);
				map.put(40,(double)1.2);
				map.put(50,(double)7.8);
				map.put(15,(double)5.7);
				map.put(25, (double)7.7);
				map.put(60,(double) 9.0);
				map.put(44,(double)9.7);
				map.put(48,(double)5.7);

				
				System.out.println("Size of map is:- "
								+ map.size());

				
				System.out.println(map);
if (map.containsKey(10)) {
					Double a = map.get((double)5.5);

									
				}
			}
		


	}


