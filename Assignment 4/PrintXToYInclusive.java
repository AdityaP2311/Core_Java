import java.util.Scanner;

public class  PrintXToYInclusive{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of X: ");
		int x = sc.nextInt();
		System.out.println("Enter Value of Y: ");
		int y = sc.nextInt();

		for(int i = x ; i <= y ; i++ )
			System.out.println(i);
	}
}