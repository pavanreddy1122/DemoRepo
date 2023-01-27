package com.fff;


import java.util.*;
import java.util.stream.Stream;

public class Demo {
	
	public static void main(String ...args) 
	{
		String []s=new String[10];
		s[2]="welcome";
		Optional empty=Optional.empty();
		System.out.println("1"+empty);
		Optional value=Optional.of(s[2]);
		value.ifPresent(System.out::println);
		System.out.println("3"+value.filter(n->n.equals("hellow")));
		System.out.println("4"+value.filter(n->n.equals("welcome")));
		System.out.println("5"+value.get());
		System.out.println("6"+value.hashCode());
		System.out.println("7"+value.isPresent());
		System.out.println("8"+Optional.ofNullable(s[2]));
		System.out.println("9"+value.orElse("value not present"));
		System.out.println("10"+empty.orElse("value not present"));
		//value.ifPresent(System.out::println);
		System.out.println("11"+value.getClass());
		
	}
}
