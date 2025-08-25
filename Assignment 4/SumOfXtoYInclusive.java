import java.util.Scanner;

public class SumOfXtoYInclusive{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of X: ");
		int x = sc.nextInt();
		System.out.println("Enter Value of Y: ");
		int y = sc.nextInt();
		int sum = 0;

		for(int i = x ; i <= y ; i++ ){
			 sum += i;
		}
		System.out.println("Sum of "+x+" to "+y+": "+sum);
	}
}