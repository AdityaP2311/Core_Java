import java.util.Scanner;
public class NumberOfCurrencyNotes{
	public static void main(String[] args){
		int one,five,ten,amt;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to be withdrawn: ");
		amt = sc.nextInt();
		
		ten = amt / 10;
		amt = amt % 10;
	
		five = amt / 5;
		amt = amt % 5;

		one = amt ;

		System.out.println("Total 10 Rs Note : "+ten );
		System.out.println("Total 5 Rs Note : "+five );
		System.out.println("Total 1 Rs Note : "+one );
	}
}