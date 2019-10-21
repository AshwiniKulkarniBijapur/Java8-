package io.javaBrains.unit2;

import io.javaBrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String[] args){
	List<Person> people = Arrays.asList(
		new Person("Charles", "Dockens",23),
		new Person("Ashwini", "Kulkarni",23),
		new Person("Mihir", "Devurkar",23)
	);
	
	//Step1 : Sort by last name
	Collections.sort(people, ( p1,  p2)-> p1.getLastName().compareTo(p2.getLastName()));
	
	
	
	//Step2: create method to print all elements
	
	performConditionally(people, p -> true, p -> System.out.println(p));
	
	//Step3: create a method to display all people last name D
	//printLastNameC(people);
	
	
	performConditionally(people, p1-> p1.getLastName().startsWith("D"),p -> System.out.println(p));
	performConditionally(people, p1-> p1.getFirstName().startsWith("A"),p -> System.out.println(p.getFirstName()));
	}
	
	//Predicate in java.util.function: takes one argument asnd returns boolean
	
		private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
			
			System.out.println("-----------------Using Lamda--------");
			for(Person p: people){
				if(predicate.test(p)){
					consumer.accept(p);
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


