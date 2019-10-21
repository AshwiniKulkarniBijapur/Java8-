package io.javaBrains;

import io.javaBrains.Unit1SolutionJava7.Condition;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1SolutionJava8 {

	public static void main(String[] args){
		List<Person> people = Arrays.asList(
			new Person("Charles", "Dockens",23),
			new Person("Ashwini", "Kulkarni",23),
			new Person("Mihir", "Devurkar",23)
		);
		
		//Step1 : Sort by last name
		Collections.sort(people, ( p1,  p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		
		
		//Step2: create method to print all elements
		
		printConditionally(people, p -> true);
		
		//Step3: create a method to display all people last name D
		//printLastNameC(people);
		
		
		printConditionally(people, p1-> p1.getLastName().startsWith("D"));
		printConditionally(people, p1-> p1.getFirstName().startsWith("A"));
		
	}
	
	//Predicate in java.util.function: takes one argument asnd returns boolean
	
	private static void printConditionally(List<Person> people, Predicate<Person> predicate){
		
		System.out.println("-----------------Using Lamda--------");
		for(Person p: people){
			if(predicate.test(p)){
			  System.out.println(p);
			}
		}
	}
	
	
	
	private static void printLastNameC(List<Person> people) {
		for(Person p: people){
			if(p.getLastName().startsWith("D")){
			  System.out.println(p);
			}
		}
	}

	


}
