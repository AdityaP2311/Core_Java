import java.util.Scanner;

public class ArrayFrequencyCount1To25Num{
	public static void main(String[] args){

		Scanner sc  = new Scanner(System.in);
	
		System.out.println("Enter a N: ");
		int n  = sc.nextInt();	

		int a[] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements (range 1 to 25):  ");
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();

		System.out.println("Entered Array is : ");
			for(int i=0; i<n; i++)
				System.out.println(a[i]);
		
		boolean visited[] = new boolean[n];

		System.out.println("Frequency of each number: ");
		
		for(int i=0; i<n; i++){
			if(visited[i] == true)
				continue;
			int cnt = 1;
			for(int j=i+1; j<n; j++){
				if(a[i] == a[j]){
					cnt++;
					visited[j] = true;
				}
			}
			System.out.println(a[i] + " occurs " + cnt + " times");
		}

		
	}
}