package test.com;

public class CovertStringLowToUp {
	
	String sen;
	
	CovertStringLowToUp(String sen){
		this.sen = sen;
	
	}
	
	public void convert() {
		
		
		  ///for (int i = 0; i < sen.length(); i++) {
			///Character c = sen.charAt(i);
			///if (Character.isLowerCase(c)) {
				///char uppercaseC   = Character.toUpperCase(c);
			///	System.out.print(" name2 " +uppercaseC);
			//	}
			
		String sen2 = sen.toUpperCase();
		System.out.println(sen2);
			
			}
	public void trim() {
		
		String sen3 = sen.trim();
		System.out.println(sen3);
		
	}	
		

	
	
	

	public static void main(String[] args) {
		CovertStringLowToUp run = new CovertStringLowToUp(" daman ");
		run.convert();
           run.trim();
	}

}
