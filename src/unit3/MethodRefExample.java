package unit3;

public class MethodRefExample {

	public static void main(String[] args) {
		
		
		Thread t = new Thread(MethodRefExample::PrintMsg); // MethodRefExample::PrintMsg is same a ()-> PrintMSg()
		t.start();
	}
	
	public static void PrintMsg(){
		System.out.println("Hello");
	}

}
