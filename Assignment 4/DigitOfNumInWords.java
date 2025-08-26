import java.util.Scanner;

public class DigitOfNumInWords{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int temp = 0 ,rev = 0;

		if(n < 0){
			System.out.println("Minus");
			n = -n;
		}
		if(n == 0){
			System.out.println("Zero");
			return;
		}
		while(n > 0){
			rev = rev * 10 + n % 10;
        		n = n/10;
    		}
		while(rev > 0){
			temp = rev % 10;
			switch(temp){
				case 0 -> System.out.println("Zero");
				case 1 -> System.out.println("One");
				case 2 -> System.out.println("Two");
				case 3 -> System.out.println("Three");	
				case 4 -> System.out.println("Four");
				case 5 -> System.out.println("Five");
				case 6 -> System.out.println("Six");
				case 7 -> System.out.println("Seven");
				case 8 -> System.out.println("Eight");
				case 9 -> System.out.println("Nine");
			}
			rev = rev / 10;
		 }

	}
}
