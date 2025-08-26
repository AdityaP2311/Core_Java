import java.util.Scanner;

public class SumOfFactors{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");	
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1 ; i<=n ; i++){
			if(n % i == 0)
				sum += i;
		}
		System.out.println("Sum of factors of "+n+" is : "+sum);
	}
}