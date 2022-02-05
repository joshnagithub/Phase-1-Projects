package Phase1;

//Compile time Polymorphism/ static polymorphism/ early binding

public class MethodOverload {
	
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverload m = new MethodOverload();
		System.out.println("Addition if 2 int "+m.add(18, 6));
		System.out.println("Addition if 2 float "+m.add(25.0f, 5.55));
		System.out.println("Addition if 2 double "+m.add(5.5, 11.2));
		System.out.println("Addition if 2 int "+m.add(7, 8, 6));
	}

}
