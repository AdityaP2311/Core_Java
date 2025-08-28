import java.util.Scanner;

public class ArrayReverse{
	public static int[] accpet(){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a N: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array of "+n+" Elements :");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		return a;
	}
	public static void display(int a[]){
		for(int x : a)
			System.out.println(x);
	}
	public static void reverse(int a[]){
		int n =a.length;
		for(int i=0; i<n/2; i++){
			int temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = temp;
		}
	}

	public static void main(String[] args){	
		int a[] =accpet();
		System.out.println("Before Reversing Array Elements are: ");
		display(a);

		reverse(a);

		System.out.println("After Reversing Array Elements are: ");
		display(a);
	}	
}