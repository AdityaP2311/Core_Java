import java.util.Scanner;

public class PrimeNumberBtwn1ToN{
	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter Value of n: ");
    		int n = sc.nextInt();
    		System.out.println("Prime Numbers from 1 to "+n+" are: ");
    	
		for(int i=2 ; i<=n ; i++){
        		int cnt=0;
        		for(int j=2; j<=Math.sqrt(i); j++){
            			if(i % j == 0){
                			cnt++;
                			break;
            			}
        		}
        		if(cnt == 0)
            			System.out.println(i+" ");
        	}
	}
}