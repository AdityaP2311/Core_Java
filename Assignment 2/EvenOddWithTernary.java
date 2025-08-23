import java.util.Scanner;

public class EvenOddWithTernary {
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		n = sc.nextInt();
		
		System.out.println(n + " is " + ((n % 2 == 0) ? "Even" : "Odd"));
	}
}