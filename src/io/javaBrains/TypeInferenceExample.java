package io.javaBrains;

public class TypeInferenceExample {
	
	
	//Input arguments and the retun type are inferred by the java compiler from the Interface. 
	public static void main(String[] args){
		//StringLenLambda myLambda = s -> s.length();
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLenLambda lambda){
		System.out.println(lambda.getLength("Hello Lambda"));
	}
	
	interface StringLenLambda {
		int getLength(String s);
	}
}
