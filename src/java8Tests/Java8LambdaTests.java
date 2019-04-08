package java8Tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8LambdaTests {
	
	public static void main(String args[]) {
		List<String> names1 = new ArrayList<String>();	
		names1.add("macknight");
		names1.add("gaber");
		names1.add("swami");
		names1.add("edson");
		names1.add("cleberson");
		List<String> names2 = new ArrayList<String>();
		names2.add("mateus");
		names2.add("vitao");
		names2.add("miguel");
		names2.add("whesley");
		names2.add("brunao");
		
		
		Java8LambdaTests testes = new Java8LambdaTests();
		System.out.println("java7 comparator:");
		testes.java7Sort(names1);
		System.out.println(names1);
		System.out.println("java8 comparator:");
		testes.java8Sort(names2);
		System.out.println(names2);
		
		
	}
	
	public void java7Sort(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}
	
	public void java8Sort(List<String> names) {
		Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
	}
	
}
