package unit3;

import io.javaBrains.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefExample2 {

		


	public static void main(String[] args){
	List<Person> people = Arrays.asList(
		new Person("Charles", "Dockens",23),
		new Person("Ashwini", "Kulkarni",23),
		new Person("Mihir", "Devurkar",23)
	);
	

	
	performConditionally(people, p -> true, p -> System.out.println(p));
	performConditionally(people, p -> true,System.out::println); // same as p->mathod(p)
	
	
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
		
		
		


		
}
