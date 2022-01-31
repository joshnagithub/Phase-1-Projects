package Phase1;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String str = new String("Welcome To New Life");
		//covert string to StringBuilder
		StringBuilder s1 = new StringBuilder(str);
		
		System.out.println("size"+s1.length());
		
		s1.append("Hello");
		System.out.println(s1);
		
		s1.insert(15, " ");
		System.out.println(s1);
		
		s1.replace(10, 20, "Bye");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);

	}

}
