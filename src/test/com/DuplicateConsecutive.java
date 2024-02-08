package test.com;

public class DuplicateConsecutive {
	
	
	
	
	public boolean dup(String str) {
		
	if (str == null || str.isEmpty()) {
        return false;
     }

     
     for (int i = 0; i <str.length()-1; i++) {
         
         if (str.charAt(i)==str.charAt(i+1)) {

             return true;
         }
     }

     
     return false;
 
	}
	public static void main(String[] args) {
		DuplicateConsecutive run = new DuplicateConsecutive();
		
		System.out.println("Consecutive letters found: "+run.dup("daman"));
		System.out.println("Consecutive letters found: "+run.dup("Hello"));
		System.out.println("Consecutive letters found: "+run.dup("aaadddd"));
		
		
	}

}
