import java.util.Scanner;

public class ArraysCompareUsingMethod{
	public static boolean compare(int a[],int b[],int n1,int n2){
		if(n1 != n2)
			return false;
		
		for(int i=0; i<n1; i++){
			if(a[i] != b[i])
				return false;
		}
		return true;	
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N for 1st Array: ");
		int n1 =sc.nextInt();
		int a[] = new int[n1];
		System.out.println("Enter Array of "+n1+" Elements:  ");
		for(int i=0; i<n1; i++)
			a[i] = sc.nextInt();
	
		System.out.println("Enter a N for 2nd Array: ");
		int n2 =sc.nextInt();
		int b[] = new int[n2];
		System.out.println("Enter Array of "+n2+" Elements:  ");
		for(int i=0; i<n2; i++)
			b[i] = sc.nextInt();

		
		if (compare(a, b, n1, n2))
			System.out.println("Both arrays are EQUAL.");
		else
			System.out.println("Arrays are NOT equal!!!!");		
	}
 }