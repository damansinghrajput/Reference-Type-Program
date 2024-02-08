package test.com;



class GFG {
	public static void main (String[] args) {
	
		String str= "NAMAD", nstr="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("NAMAD"); 
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}

