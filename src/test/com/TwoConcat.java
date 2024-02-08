package test.com;

// Write a program to concatenate Two strings

public class TwoConcat {
	
	
	public void  addConCat(String s1,String s2) {
		
		String name3 = s1.concat(s2);
		
		System.out.println("Full Name :" +name3);
			
		}
		

	
	

	public static void main(String[] args) {
		TwoConcat run = new TwoConcat();
		run.addConCat("Daman", "Rajput");

	}

}
