import java.util.Scanner;

public class PrintSumAndCountOfFactors{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");	
		int n = sc.nextInt();
		
		int sum = 0 , cnt = 0;
		System.out.println("Factors of "+n+" are : ");
		for(int i=1 ; i<=n ; i++){
			if(n % i == 0){
				System.out.print(i+" ");
				cnt++;
				sum += i;
			}
		}
		System.out.println("\nSum of factors of "+n+" is : "+sum);
		System.out.println("Count of Factors of "+n+" is : "+cnt);
	}
}