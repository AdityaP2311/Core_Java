import java.util.Scanner;

public class MaxMin1{
	public static void main(String[] args){
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		if(a >= b && a > c)
			System.out.println(a+" is Maximum");
		else if( b > c && b > a)
			System.out.println(b+" is Maximum");
		else
			System.out.println(c+" is Maximum");

		if(a <= b && a < c)
			System.out.println(a+" is Minimum");
		else if( b < c && b < a)
			System.out.println(b+" is Minimum");
		else
			System.out.println(c+" is Minimum");
	}
}