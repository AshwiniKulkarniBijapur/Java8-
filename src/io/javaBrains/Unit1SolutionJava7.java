package io.javaBrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1SolutionJava7 {
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
			new Person("Charles", "Dockens",23),
			new Person("Ashwini", "Kulkarni",23),
			new Person("Mihir", "Devurkar",23)
		);
		
		//Step1 : Sort by last name
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		
		
		//Step2: create method to print all elements
		
		printall(people);
		
		//Step3: create a method to display all people last name D
		printLastNameC(people);
		
		
		printConditionally(people, new Condition(){

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("D");
			}
			
		});
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition){
		
		System.out.println("-----------------Using Condition--------");
		for(Person p: people){
			if(condition.test(p)){
			  System.out.println(p);
			}
		}
	}
	
	interface Condition {
		boolean test(Person p);
	}
	
	private static void printLastNameC(List<Person> people) {
		for(Person p: people){
			if(p.getLastName().startsWith("D")){
			  System.out.println(p);
			}
		}
	}

	public static void printall(List<Person> people){
		for(Person p: people){
			System.out.println(p);
		}
	}
}
