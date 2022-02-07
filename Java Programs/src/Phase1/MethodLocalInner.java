package Phase1;

public class MethodLocalInner {

	public void display()
	{
		class Inner{
			
			int a=50;
			
			void print()
			{
				System.out.println("Method of Inner class");
				System.out.println("Value of a "+a);
			}
		}
		
		Inner inner= new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		MethodLocalInner outer =new MethodLocalInner();
		outer.display();
	}
}
