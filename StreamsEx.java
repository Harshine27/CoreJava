package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsEx {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(70);
		l.add(105);
		l.add(200);
		l.add(115);
		l.add(25);
		l.add(30);
		System.out.println(l);
	
		ArrayList<Integer> l1 = new ArrayList<>();
		for (Integer i : l) {
			if(i%2 == 0) {
				l1.add(i);
				
			}
			
		}
	System.out.println(l1);
		
     List<Integer> f = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(f);
		List<Integer> map = l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(map);
	
		long cou = l.stream().filter(i->i%2==0).count();
		System.out.println(cou);
		
		List<Integer> sort = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);

	}

}
