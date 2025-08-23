import java.util.Scanner;

public class MaxMinUsingTernaryOp{
	public static void main(String[] args){
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		b = ( a > b ) ? a : b;
		b = ( c > b ) ? c : b;
	 
		System.out.println(b+" is Maximum");

		b = ( a < b ) ? a : b;
		b = ( c < b ) ? c : b;
	 
		System.out.println(b+" is Minimum");	
	}
}