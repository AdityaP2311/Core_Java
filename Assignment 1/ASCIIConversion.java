import java.util.Scanner;

public class ASCIIConversion{
	public static void main(String []args){
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character to Display ASCII Value: ");
		ch = sc.next();
		
		int ascii = (int)ch.charAt(0) ;
	
		System.out.println("ASCII Value of "+ch+ " is "+ascii);
	}
}