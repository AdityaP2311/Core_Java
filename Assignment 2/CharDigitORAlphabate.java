import java.util.Scanner;

public class CharDigitORAlphabate{
	public static void main(String[] args){
		char ch;
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Letter or Character: ");
		ch = sc.next().charAt(0);
		char temp = ch;
		
		if (ch >= 48 && ch <= 57)  
			System.out.println(ch + " is a Digit");
        	else if (ch >= 97 && ch <= 122)  
			System.out.println(ch + " is a Lowercase Alphabet"); 
		else if (ch >= 65 && ch <= 90) 
			System.out.println(ch + " is an Uppercase Alphabet");
        	else 
            		System.out.println(ch + " is neither Digit nor Alphabet");
	}
}