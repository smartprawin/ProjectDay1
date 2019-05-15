package org.hgchvg.login;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
	public static void main(String[] args) {
		Set<Character> si=new TreeSet<Character>();
		si.add('&');
		si.add('#');
		si.add('a');
		si.add('+');
		si.add('!');
		System.out.println(si);
		
		si.remove('#');
		System.out.println(si);
	}
}
