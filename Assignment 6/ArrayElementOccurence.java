import java.util.Scanner;

public class ArrayElementOccurence{

	public static int Occurence(int a[],int n,int key){
		int cnt = 0;
		for(int i=0; i<n; i++){
			if(a[i]==key)
				cnt++;
		}
		return cnt;
				
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a N:");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter Array of "+n+" Elements");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		System.out.println("Enter a Integer Number to Find Occurence: ");
		int key = sc.nextInt();

		System.out.println("Occurence of "+key+" is : "+Occurence(a,n,key));
	}
}