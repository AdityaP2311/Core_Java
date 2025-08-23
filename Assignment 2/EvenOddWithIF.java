import java.util.Scanner;

public class EvenOddWithIF{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		n = sc.nextInt();
		
		if(n % 2 == 0)
			System.out.println(n+" is Even Number");
		else
			System.out.println(n+" is Odd Number");
	}
}