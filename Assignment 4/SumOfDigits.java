import java.util.Scanner;

public class SumOfDigits{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;

		while(n>0){
			int rem = n % 10;
			sum += rem;
			n/=10;
		}
		System.out.println("Sum of Digits of "+temp+" is :"+sum);
	}
}