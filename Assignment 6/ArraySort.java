import java.util.Scanner;

public class ArraySort{
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
	public static void sort(int a[]){
		int n =a.length;
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];	
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}
	}

	public static void main(String[] args){	
		int a[] =accpet();
		System.out.println("Before Sorting Array Elements are: ");
		display(a);

		sort(a);

		System.out.println("After Sorting Array Elements are: ");
		display(a);
	}	
}