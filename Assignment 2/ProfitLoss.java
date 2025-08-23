import java.util.Scanner;

public class ProfitLoss{
	public static void main(String[] args){
		int cp,sp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Cost Price: ");
		cp = sc.nextInt();
		System.out.println("Enter Selling Price ");
		sp = sc.nextInt();
		
		if(cp < sp )
			System.out.println("Profit = "+(sp - cp));
		else if (cp > sp)
			System.out.println("Loss = "+(cp - sp));
		else
			System.out.println("Nor Profit Neither Loss !!!!!");
	}
}