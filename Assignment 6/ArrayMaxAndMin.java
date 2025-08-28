import java.util.Scanner;

public class ArrayMaxAndMin{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Array of "+n+"Elements: ");
		for(int i=0; i<n; i++)	
			a[i] = sc.nextInt();
		
		int max = a[0];
		for(int i=0; i<n; i++)
			if(max < a[i])
				max = a[i];

		int min = a[0];
		for(int i=0; i<n; i++)
			if(min > a[i])
				min = a[i];
	
		System.out.println("Maximum of Array Elements is : "+max);
		System.out.println("Minimum of Array Elements is : "+min);
	}
}