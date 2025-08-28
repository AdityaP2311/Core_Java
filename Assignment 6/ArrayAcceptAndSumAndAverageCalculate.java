import java.util.Scanner;

public class  ArrayAcceptAndSumAndAverageCalculate{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N: ");
		int n = sc.nextInt();
		
		int a [] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements:");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		int sum = 0;
		for(int i=0; i<n; i++)
			sum += a[i];
		System.out.println("Sum of "+n+" Numbers is : "+sum);
		System.out.println("Average of "+n+" Numbers is : "+(sum/n));
	}
}

