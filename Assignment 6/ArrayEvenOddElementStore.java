import java.util.Scanner;

public class ArrayEvenOddElementStore{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		int even[] = new int[n];
		int odd[] = new int[n];

		int e = 0, o = 0;
		for(int i=0; i<n; i++){
			if(a[i] % 2 == 0)
				 even[e++] =a[i];
			else
				odd[o++] = a[i];
		}
		System.out.println("Even Elements in Array are: ");
		for(int i=0; i<e; i++)
			System.out.println(even[i]);
			
		System.out.println("Odd Elements in Array are: ");
		for(int i=0; i<o; i++)
			System.out.println(odd[i]);
	}
}