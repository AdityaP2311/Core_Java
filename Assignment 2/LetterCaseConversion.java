import java.util.Scanner;

public class LetterCaseConversion{
	public static void main(String[] args){
		char ch;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Letter or Character: ");
		ch = sc.next().charAt(0);
		char temp = ch;
		
		if(ch >= 'a' && ch <= 'z'){
			ch = (char)((int)ch - 32);
			System.out.println("UpperCase Conversion of "+temp+" is "+ch);
		}
		else if(ch >= 'A' && ch <= 'A'){
			ch = (char)((int)ch + 32);
			System.out.println("LowerCase Conversion of "+temp+" is "+ch);
		}
		else
			System.out.println(ch+" is Not an Alphabate ");
	}
}