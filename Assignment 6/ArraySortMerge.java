import java.util.Scanner;

public class ArraySortMerge{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array: ");
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		System.out.println("Enter Array of "+n1+" sorted Elements: ");
		for(int i=0; i<n1; i++)
			a[i] = sc.nextInt();
	
		System.out.println("Enter size of second array: ");
		int n2 = sc.nextInt();
		int b[] = new int[n2];
		System.out.println("Enter Array of "+n2+" sorted Elements: ");
		for(int i=0; i<n2; i++)
			b[i] = sc.nextInt();

		int c[] = new int[n1 + n2];
		
		int i = 0, j = 0, k = 0;

		while(i < n1 && j <n2){
			if(a[i] <= b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i < n1){
			c[k++] = a[i++];
		}
		while(j< n2){
			c[k++] = b[j++];
		}
		System.out.println("\nMerged Sorted Array: ");
		for(int x=0; x<(n1 + n2); x++)
			System.out.println(c[x]);
	}
}