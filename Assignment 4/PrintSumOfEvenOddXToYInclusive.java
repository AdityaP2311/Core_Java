import java.util.Scanner;

public class  PrintSumOfEvenOddXToYInclusive{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Value of X: ");
		int x = sc.nextInt();
		System.out.println("Enter Value of Y: ");
		int y = sc.nextInt();
	
		int sum = 0;
		for(int i = x ; i <= y ; i++ ){
			if(i % 2 == 0)
				sum += i;
		}		
		System.out.println("Sum of Even Numbers from "+x+" to "+y+" is : "+sum);

		int sum2 = 0;
		for(int i = x ; i <= y ; i++ ){
			if(i % 2 != 0)
				sum2 += i;
		}
		System.out.println("Sum Of Odd Numbers from "+x+" to "+y+" are: "+sum2);
	}
}