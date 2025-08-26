import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int flag = 1 ;
		if(n < 2)
			flag = 0;
		else if(n == 2 || n == 3 )
			flag = 1;
		else if(n % 2 == 0 || n % 3 ==0)
			flag = 0;
		else{
			for(int i=5; i<=Math.sqrt(n); i+=6){
				if (n % i == 0 || n % (i + 2) == 0){
					flag = 0;
					break;
				}
			}
		}
		if (flag == 1)
                	System.out.println(n + " is Prime Number");
            	else 
                	System.out.println(n + " is not Prime Number!!!!");
	}
}