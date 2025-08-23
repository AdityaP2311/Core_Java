import java.util.Scanner;

public class PositiveNegativeNum{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		n = sc.nextInt();
		
		if(n > 0)
			System.out.println(n+" is Positive Number");
		else
			System.out.println(n+" is Negative Number");
	}
}