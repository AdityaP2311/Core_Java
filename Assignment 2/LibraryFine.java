import java.util.Scanner;

public class LibraryFine{
	public static void main(String[] args){
		int n;

		Scanner sc = new Scanner(System.in);

    		System.out.println("Enter the number of late days:- ");
    		n = sc.nextInt();
	
    		if( n <= 5)
        		System.out.println("You got Rs.50 Fine...");
    		else if(n <= 10 && n >= 6)
        		System.out.println("You got Rs.150 Fine...");
    		else
       			System.out.println("You got Rs.200 Fine...");
	}
 }