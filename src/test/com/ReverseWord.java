package test.com;

public class ReverseWord {
	
	char ch;
	
	public void name(String name) {
		
		
		
		for (int i = 0; i <name.length(); i++) {
			
			 ch = name.charAt(i);
			
			 System.out.println("name :" + ch); 
		 
		}
		
		
		}
	

	public static void main(String[] args) {
		ReverseWord run = new ReverseWord();
		run.name("daman");

	}
}
