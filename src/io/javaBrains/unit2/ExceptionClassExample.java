package io.javaBrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionClassExample {
	
 public static void main(String[] args){
	 int[] someNum = {1,2,3,4,5};
	 int key = 0;
	 
	/* process(someNum,key, (v,k)-> {
		 try{
			 System.out.println(v/k);
		 }catch(ArithmeticException e){
			 System.out.println("Arithmetic Exception happened");
		 }
	 });*/
		// Wrapper lambda 
	 process(someNum,key, wrapperLambda((v,k)-> {System.out.println(v/k);}));
 }

	private static void process(int[] someNum, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: someNum){
			consumer.accept(i, key);
		}
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (v,k)-> {
			try{
			System.out.println("Executing from the wrapper");
			consumer.accept(v, k);
			}
			catch(ArithmeticException e){
				System.out.println("exception caught in wrapper lambda");
			}
		};
	}
}
