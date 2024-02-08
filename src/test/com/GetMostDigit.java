package test.com;

//Character.isDigit(c): This method takes a character c as its argument and 
//returns true if c is a digit (0-9), and false otherwise.


// Character.getNumericValue(c): This method takes a character c as its argument and returns the numeric value of c 
 // if it's a digit. If c is not a digit, the method returns a value that's
// not a digit (this value can be ignored for this problem as we're only interested in digits).



public class GetMostDigit {
	
	
	
	public int most(String str) {
		
		int sum =0;
		if(str.isEmpty()){
	          return -1;
	    }
		
		for (int i = 0; i <str.length(); i++) {
			char currentChar = str.charAt(i);
			
			if(Character.isDigit(currentChar)) {
				sum++;
			}
		}
		
	
		return sum;
	}
	public static void main(String[] args) {
		GetMostDigit run = new GetMostDigit();
		System.out.println("No of integer: " +run.most("the daman is d"));
		
		
	}

}
