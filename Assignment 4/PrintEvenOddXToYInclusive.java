import java.util.Scanner;
public class PrintEvenOddXToYInclusive{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of X: ");
		int x = sc.nextInt();
		System.out.println("Enter Value of Y: ");
		int y = sc.nextInt();

		System.out.println("Even Numbers from "+x+" to "+y+" are: ");
		for(int i = x ; i <= y ; i++ ){
			if(i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("Odd Numbers from "+x+" to "+y+" are: ");
		for(int i = x ; i <= y; i++ ){
			if(i % 2 != 0 )
			System.out.println(i);
		}
	}
}