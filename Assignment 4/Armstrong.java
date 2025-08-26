import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int temp = n;
		int cnt = 0 ;
		double arm = 0;
		
		while(n>0){
			cnt++;
			n/=10;
		}
		n = temp;
		while(n>0){
			int rem = n % 10;
			arm += Math.pow(rem,cnt);	
			n /= 10;
		}
		if(arm == temp)
			System.out.println(temp+" is a Armstrong Number");
		else
			System.out.println(temp+" is not a Armstrong Number!!!!!");
	}
}