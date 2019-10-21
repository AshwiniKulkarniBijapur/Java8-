package unit3;

import io.javaBrains.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dockens",23),
				new Person("Ashwini", "Kulkarni",23),
				new Person("Mihir", "Devurkar",23)
			);
		
		//External iterator: usre is controlling iterating
		System.out.println("Using for loop");
		for(int i = 0; i< people.size(); i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("Using foreach");
		
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println("Using lambda exp: Internal iterator");
		
		people.forEach(System.out::println);
	}

}
