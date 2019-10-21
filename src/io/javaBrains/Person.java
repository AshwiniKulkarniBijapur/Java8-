package io.javaBrains;

public class Person {
  private String firstName;
  private String lastName;
  private int age;
  
  public Person(String fname, String lname, int age){
	  super();
	  this.firstName = fname;
	  this.lastName = lname;
	  this.age = age;
  }

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString(){
	return "Person[ fname ="+this.firstName+"  lname ="+this.lastName+" age="+this.age+"]";
}
}
