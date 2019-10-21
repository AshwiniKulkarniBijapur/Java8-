package io.javaBrains.unit2;

public class ThisReferenceExample {
	
	public void doProcess(int i, Process p){
		p.process(i);
	}
	
		public void execute(){
			doProcess(10, (i)-> {
				System.out.println("value i "+ i);
				System.out.println(this); //this does not work ?lambda exp : inSTANCE O LAMBDA DOES NOT TOUCH "THIS"
			});
		}
		
		public String toString(){
			
			return "This is ";
		}

	public static void main(String[] args) {
		ThisReferenceExample thisObj = new ThisReferenceExample();
		thisObj.doProcess(10, (i)-> {
			System.out.println("value i "+ i);
			//System.out.println(this); //this does not work ?lambda exp : inSTANCE O LAMBDA DOES NOT TOUCH "THIS"
		});
		
		thisObj.execute();
	}

}

interface Process{
	void process(int i);
}
