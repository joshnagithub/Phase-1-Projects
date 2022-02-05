package Phase1;

public class CallMethod {

	int num=350;

	void operation(int num) 
	{
		this.num = num*10/100;
	
	}

	public static void main(String args[]) {
		CallMethod c = new CallMethod();
		System.out.println("Before function call value of num is "+c.num);
		c.operation(100);
		System.out.println("After function call value of num is "+c.num);
	}
}

		
