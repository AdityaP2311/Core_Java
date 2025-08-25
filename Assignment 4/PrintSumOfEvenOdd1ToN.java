import java.util.Scanner;

public class PrintSumOfEvenOdd1ToN{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a N: ");
		int n = sc.nextInt();
	
		int sum = 0;
		for(int i = 1 ; i <= n ; i++ ){
			if(i % 2 == 0)
				sum += i;
		}		
		System.out.println("Sum of Even Numbers from 1 to "+n+" is : "+sum);

		int sum2 = 0;
		for(int i = 1 ; i <= n ; i++ ){
			if(i % 2 != 0)
				sum2 += i;
		}
		System.out.println("Sum Of Odd Numbers from 1 to "+n+" are: "+sum2);
	}
}