import java.util.Scanner;

public class PowerXOfN{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value of X : ");
		int x = sc.nextInt();
		System.out.println("Enter the Power Value of X : ");
		int n = sc.nextInt();

		int pow = 1;
		for(int i = 1 ; i <= n ; i++ )
			pow *= x;
		System.out.println(x+" ^ "+n+" = "+pow);
	}
}