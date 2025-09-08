import java.util.Scanner;

public class ArrayElementDelete{

	public static int delete(int a[],int n,int key){
		for(int i=0; i<n; i++){
			if(a[i] == key){
				for(int j=i; j<n-1; j++){
					a[j] = a[j+1];
				}
			n--;
			}
		}
		return n;
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:");
		int n = sc.nextInt();
	
		int a[] = new int[n];
		
		System.out.println("Enter Array of "+n+" Elements");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		System.out.println("Enter a Number to Delete: ");
		int key = sc.nextInt();
		n = delete(a,n,key);	
		System.out.println("\nArray After Deletion is :");
		for(int i=0; i<n; i++)
			System.out.println(a[i]);	
	}
}