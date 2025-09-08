import java.util.Scanner;
import java.util.Arrays;

public class ArraySortedAcceptAndDisplay{

	public static int[] accept(int n){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[n];
		
		System.out.println("Enter Array of "+n+" Elements");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		Arrays.sort(a);

		return a;
	}
	public static void display(int a[]){
		System.out.println("\nSorted Array is :");
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);	
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:");
		int n = sc.nextInt();
			
		int sortedArray[] = accept(n);
		display(sortedArray);		
	}
}