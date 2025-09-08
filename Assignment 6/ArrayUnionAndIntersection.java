import java.util.Scanner;

public class ArrayUnionAndIntersection{
	public static boolean checkArr(int arr[], int n, int key){
		for(int i=0; i<n; i++){
			if(arr[i] == key)
				return true;
		}
		return false;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array: ");
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		System.out.println("Enter Array of "+n1+" Elements: ");
		for(int i=0; i<n1; i++)
			a[i] = sc.nextInt();
	
		System.out.println("Enter size of second array: ");
		int n2 = sc.nextInt();
		int b[] = new int[n2];
		System.out.println("Enter Array of "+n2+" Elements: ");
		for(int i=0; i<n2; i++)
			b[i] = sc.nextInt();

		int union[] = new int[n1 + n2];
		int u = 0;
		
		for(int i=0; i<n1; i++){
			if(!checkArr(union,u,a[i]))
				union[u++] = a[i];
		}
		for(int i=0; i<n2; i++){
			if(!checkArr(union,u,b[i]))
				union[u++] = b[i];
		}
		
		int inter[] = new int[Math.min(n1,n2)];
		int in = 0;
		for(int i=0; i<n1; i++){
			if(checkArr(b,n2,a[i]) && !checkArr(inter,in,a[i]))
				inter[in++] = a[i];
		}
		
		System.out.println("\nUnion of Arrays: ");
		for(int i=0; i<u; i++)
			System.out.println(union[i]);

		System.out.println("\nIntersection of Arrays: ");
		for(int i=0; i<in; i++)
			System.out.println(inter[i]);

		
		
	}
}