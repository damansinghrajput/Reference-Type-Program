package test.com;

public class TwoStringCompare {
	   
	int maxWord;
	
	public void compare(String name1 , String name2) {
		
		 maxWord = name1.compareTo(name2);    // compareToIgnoreCase
		 
		 
		 if(maxWord<0) {
			 
			 System.out.println("name2 is greater than name1");
		 }
		 
		 else  if(maxWord==0) {
			 System.out.println("name1 equals name2");
			 
		 }
		
		 else if(maxWord>0) {
			 
			 System.out.println("name1 is greater than name2");
		 }
	}
	
	
	

	public static void main(String[] args) {
		TwoStringCompare run = new TwoStringCompare();
		run.compare("daman","daman");
	
	}

}
