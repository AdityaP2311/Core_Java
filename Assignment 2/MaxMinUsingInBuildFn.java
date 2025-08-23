import java.util.Scanner;

public class MaxMinUsingInBuildFn{
	public static void main(String[] args){
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max = Math.max(a, Math.max(b, c));
		System.out.println("Maximum is: " + max);

		int min = Math.min(a, Math.min(b, c));
		System.out.println("Minimum is: " + min);	
	}
}