import java.util.Scanner;

public class CountOfFactors{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");	
		int n = sc.nextInt();
		
		int cnt =0;
		
		for(int i=1 ; i<=n ; i++){
			if(n % i == 0)
				cnt++;
		}
		System.out.println("Count of Factors of "+n+" is : "+cnt);
	}
}