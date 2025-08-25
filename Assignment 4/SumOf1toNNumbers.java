import java.util.Scanner;

public class SumOf1toNNumbers{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N: ");
		int n = sc.nextInt();

		//With Using Loop 

		int sum = 0;
		for(int i = 1 ; i <= n ; i++ ){
			 sum += i;
		}
		System.out.println("Sum of 1 to "+n+": "+sum);

		//Without Using Loop
		
		sum = ( n * ( n + 1 ) ) / 2;
		System.out.println("Sum of 1 to "+n+" : "+sum);
	}
}