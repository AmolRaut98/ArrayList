package com.companay.client.projname.modul.submodul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		HashSet <Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		
		 ArrayList<Integer> list1 = new ArrayList<Integer>(set);
		
		
//		for(Integer s:list) {
//			
//			System.out.print(" "+s);
//		}
//		

		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}
