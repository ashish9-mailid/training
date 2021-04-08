package com.training.files;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import com.training.bean.Person;

public class Demo2 {
	
	public static void main(String[] args) {
		
		//Stream<Integer> stream1 = Stream.of(2,3,5,6,7,8,9,2,1,7,8,9);
		
		//stream1.filter(i->i%2!=0).forEach(System.out::println);
		
		/*
		 * List<Integer> list1=Arrays.asList(new Integer[] {5,6,7,8,3,2});
		 * list1.stream().forEach(System.out::print);
		 * 
		 * System.out.println();
		 * list1.parallelStream().map(i->i*i).forEach(System.out::println);
		 */
		
		Map<Integer,Person> map =  new TreeMap<>();
		map.put(4, new Person(4, "sam", 23));
		map.put(2, new Person(2, "john", 24));
		map.put(1, new Person(1, "bob", 22));
		map.put(5, new Person(5, "peter", 25));
		
		map.forEach((key,value)->System.out.println(key+" "+value));
		
		
		
	}

}
