import java.util.Scanner;

public class CountNumOfDigit{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int temp = n;
		int cnt = 0;
	
		while(n > 0){
			cnt++;
			n /= 10;
		}
		System.out.println("Count of the number of Digits in "+temp+" is : "+cnt);	
	}
}