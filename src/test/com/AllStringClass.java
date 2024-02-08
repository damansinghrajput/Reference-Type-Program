package test.com;

public class AllStringClass {

	public static void main(String[] args) {
		 String a="Daman Singh";
	        String b="daman singh";
	        System.out.println("A : "+a);
	        System.out.println("B : "+b);
	 
	        System.out.println("A HashCode "+a.hashCode());
	        
	        System.out.println("B HashCode "+b.hashCode());
	        System.out.println("Equals : "+a.equals(b));
	        System.out.println("Equals Ignore Case: "+a.equalsIgnoreCase(b));
	        System.out.println("Length: "+a.length());
	        System.out.println("CharAt: "+a.charAt(0));
	        System.out.println("Uppercase: "+a.toUpperCase());
	        System.out.println("Lowercase: "+a.toLowerCase());
	        System.out.println("Replace: "+a.replace("Joes","Stanley"));
	        System.out.println("Contains : " + a.contains("Joes"));
	        System.out.println("Empty : " + a.isEmpty());
	        System.out.println("EndWith : " + a.endsWith("es"));
	        System.out.println("StartWith : " + a.startsWith("Tut"));
	        System.out.println("Substring : " + a.substring(5));
	        System.out.println("Substring : " + a.substring(0, 5));
	        System.out.println("concat :" +a.concat(" Rajput"));
	       
	    }

	}


