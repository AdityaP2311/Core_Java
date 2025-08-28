import java.util.Scanner;

public class ArrayLinearSearch{

	public static int LinearSearch(int a[],int n,int key){
		for(int i=0; i<n; i++){
			if(a[i]==key)
				return i;
		}
		return -1;		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a N:");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter Array of "+n+" Elements");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		System.out.println("Enter a Search Element: ");
		int key = sc.nextInt();

		if(LinearSearch(a,n,key) == -1)
			System.out.println(key+ " is Not Found in Array !!!!!!");
		else
			System.out.println(key+" is Found at Position : "+LinearSearch(a,n,key));
	}
}