import java.util.Scanner;

public class PerfectNumberBtwn1ToN{
	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter Value of n: ");
    		int n = sc.nextInt();
    		System.out.println("Prime Numbers from 1 to "+n+" are: ");
    	
		for(int i=1 ; i<=n ; i++){
        		int sum = 0;
			int num = i;
        		for(int j=1; j<=num/2; j++){
            			if(num % j == 0){
                			sum += j;
            			}
        		}
        		if(sum == num)
            			System.out.println(num+" ");
        	}
	}
}
