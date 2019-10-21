package unit3;

import io.javaBrains.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample1 {
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dockens",23),
				new Person("Ashwini", "Kulkarni",23),
				new Person("Mihir", "Devurkar",23)
			);
		
		
		//Stream has always source. operation, terminal operation
		people.stream()
		.filter(p->p.getLastName().startsWith("D"))
		.forEach(p->System.out.println(p.getFirstName()));
		
		long count = people.stream()
		.filter(p->p.getLastName().startsWith("D"))
		.count();
	
		 System.out.println(count);
		 
	// run the collections on multiple cores of processor
		 long count1 = people.parallelStream()
					.filter(p->p.getLastName().startsWith("D"))
					.count();
		
	}
}
