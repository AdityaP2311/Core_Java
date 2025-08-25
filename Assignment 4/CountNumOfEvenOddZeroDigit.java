import java.util.Scanner;

public class CountNumOfEvenOddZeroDigit{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Integer: ");
		int n = sc.nextInt();
		int temp = n , rem = 0 ,even = 0 ,odd = 0, zero = 0;

		if(n == 0)
			zero = 1;
	
		while(n > 0){
			rem = n % 10;

			if(rem == 0)
				zero++;
			else if(rem % 2 == 0)
				even++;
			else
				odd++;
			n /= 10;
		}
		System.out.println("The Number of Even Digits = "+even);
		System.out.println("The Number of Odd Digits  = "+odd);
		System.out.println("The Number of Zero Digits = "+zero);
	}
}   