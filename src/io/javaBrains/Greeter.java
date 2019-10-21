package io.javaBrains;

public class Greeter {
  public void greet(Greeting greeting){
	  greeting.perform();
  }
  
  public static void main(String[] args){
	  Greeter greeter = new Greeter();
	  
	  
	  Greeting hwGreeting = new HelloWorldGreeting(); // Instance of Interface
	  Greeting myLambdaGreeting = () -> System.out.println("Hello World Lambda"); // Lambda expression of Interface
	  
	  
	  hwGreeting.perform();
	  myLambdaGreeting.perform();
	 
	  
	  // Anonymous inner class of Interface Greeting
	  Greeting innerClassGreeting = new Greeting(){
		  public void perform(){
			  System.out.println("Hello Inner class");
		  }
	  };
	  
	  innerClassGreeting.perform();
	 // Lambdas are similar to anonymous inner class. but they two are dofferent
	  
	  
	  greeter.greet(myLambdaGreeting);
	  greeter.greet(innerClassGreeting);
  }
}


