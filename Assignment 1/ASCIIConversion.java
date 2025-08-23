import java.util.Scanner;

public class ASCIIConversion{
	public static void main(String[] args){
		char ch;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Any Character : ");
		ch = sc.next().charAt(0);
		
		System.out.println("ASCII Value of "+ch+" is : " + (int)ch );
	}
}