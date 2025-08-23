import java.util.Scanner;

public class MaxMin2{
	public static void main(String[] args){
		int a,b,c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		if(a > b)
			b = a;
		if( c > b)
			b = c;
		System.out.println(b+" is Maximum");

		if(a < b)
			b = a;
		if( c < b)
			b = c;
		System.out.println(b+" is Minimum");

		
	}
}