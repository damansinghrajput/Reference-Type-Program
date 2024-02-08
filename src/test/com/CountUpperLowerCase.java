package test.com;

public class CountUpperLowerCase {
	
	
	
	
	public void count(String str) {
		
		int upperCase=0;
		int lowerCase=0;
		
		for (int i = 0; i<str.length(); i++) {
			
			char currentChar = str.charAt(i);
			
			if(Character.isUpperCase(currentChar)) {
				upperCase++;}
			
			else if(Character.isLowerCase(currentChar)) {
				lowerCase++;}
			
			
		}
		
		
		System.out.println("Total UpperCount :"+upperCase);
		System.out.println("Total LowerCount :"+lowerCase);
	}

	public static void main(String[] args) {
		CountUpperLowerCase run = new CountUpperLowerCase();
		run.count("Daman SIngh");

	}

}
