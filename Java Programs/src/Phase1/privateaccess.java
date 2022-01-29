package Phase1;

class privateaccessmodifier
{
	private void display()
	{
		System.out.println("You are using private access modifier");
	}
}
public class privateaccess {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Modifier");
		privateaccessmodifier obj = new privateaccessmodifier();

	//trying to access private method of another class
    //obj.display();
	}

}
