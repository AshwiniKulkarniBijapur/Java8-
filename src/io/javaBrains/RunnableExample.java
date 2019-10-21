package io.javaBrains;

public class RunnableExample {
  public static void main(String[] args){
	  Thread myThread = new Thread(new Runnable(){
		  @Override
		  public void run(){
			  System.out.println("Printed Inside Runnable");
		  }
	  });
	  
	  myThread.run();
	  
	  
	  //Instaed of inner class, we cam create a lambda expression because a lambda exp behaves almost same as 
	  // the instance of interface implementation (Interface need to have only one method)
	  
	  Thread myLambdaThread = new Thread(()-> System.out.println("Printed Inside Lambda")); 
	  myLambdaThread.run();
  }
}
