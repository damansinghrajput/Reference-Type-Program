package test.com;

public class LengthOfString {
	
	
	public void length(String name) {
		
		int a = name.length();
		
		System.out.println("Get the length :"+a);
		
	}
	
	
	

	public static void main(String[] args) {
		
		LengthOfString run = new LengthOfString();
		run.length(" daman singh");
	}

}
