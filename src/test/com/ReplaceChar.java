package test.com;

public class ReplaceChar {
	
	public void name(String name , String name1 ) {
		
		String name2 = name.replaceAll(name, name1);
		
		System.out.println("Replace Name :"+name2);
	}

	public static void main(String[] args) {
		ReplaceChar run = new ReplaceChar();
		run.name("daman", "aman");

	}

}
