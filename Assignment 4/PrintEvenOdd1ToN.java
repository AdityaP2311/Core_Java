import java.util.Scanner;

public class PrintEvenOdd1ToN{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a N: ");
		int n = sc.nextInt();

		System.out.println("Even Numbers from 1 to "+n+" are: ");
		for(int i = 1 ; i <= n ; i++ ){
			if(i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("Odd Numbers from 1 to "+n+" are: ");
		for(int i = 0 ; i <= n; i++ ){
			if(i % 2 != 0 )
			System.out.println(i);
		}

	}
}