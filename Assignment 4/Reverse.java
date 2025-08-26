import java.util.Scanner;

public class Reverse{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;

		while(n>0){
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("Reverse of "+temp+" is :"+rev);
	}
}