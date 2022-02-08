package Phase1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	public static void main(String[] args) {
		
		String regex="^(?=.*[A-Z]).{8,}";
		String input="JOSH@9550";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if(match.matches())
		{
			System.out.println("Password valid");
		}
		else
		{
			System.out.println("Password Not valid");
		}
	}
}
