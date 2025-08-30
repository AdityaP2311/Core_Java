import java.util.Scanner;

public class ArrayCopyUsingMethod{
	public static void copy(int a[],int n){
		int b[] = new int[n];

		for (int i=0; i<n; i++) {
        		b[i] = a[i];      		
		}

		System.out.println("Copied Array is : ");
		for(int i=0; i<n; i++)
			System.out.println(b[i]);
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N: ");
		int n =sc.nextInt();
		
		int a[] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements:  ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		System.out.println("Entered Array is : ");
		for(int i=0; i<n; i++)
			System.out.println(a[i]);
		copy(a,n);		
	}
 }