import java.util.Scanner;

public class  NumberDivisibleBy5And7WithElseIf{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		n = sc.nextInt();
		
		if(n % 5 == 0 && n % 7 == 0)
			System.out.println(n+" is Divisible by both  5 and 7");
        	else if(n % 5 == 0)
            		System.out.println(n+" is Divisible by 5 but not 7");
		else if( n % 7 == 0)
			System.out.println(n+" is Divisible by 7 but not 5");
		else
			System.out.println(n+" is nor divisible by 7 neither 5");
	}
}