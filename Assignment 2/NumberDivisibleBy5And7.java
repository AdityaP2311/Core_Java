import java.util.Scanner;

public class  NumberDivisibleBy5And7{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		n = sc.nextInt();
		
		if(n % 5 == 0 && n % 7 == 0)
			System.out.println(n+" is Divisible by 5 and 7");
		else
			System.out.println(n+" is not Divisible by 5 and 7");
	}
}