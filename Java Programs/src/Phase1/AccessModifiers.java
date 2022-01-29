package Phase1;

public class AccessModifiers {

	public void methodPublic()
	{
		System.out.println("This is my Public Method");
	}
	public void methodPrivate()
	{
		System.out.println("This is my Private Method");
	}
	public void methodProtected()
	{
		System.out.println("This is my Protected Method");
	}
	public void methodDefault()
	{
		System.out.println("This is my Default Method");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.methodPublic();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodDefault();
    }
}