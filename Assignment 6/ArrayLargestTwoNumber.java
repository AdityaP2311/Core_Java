import java.util.Scanner;

public class ArrayLargestTwoNumber{
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
	
		System.out.println("Enter a N: ");
		int n  = sc.nextInt();
		
		if (n < 2) {
            		System.out.println("Array must have at least two elements!");
            		return;
        	}	

		int a[] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements: ");
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();

		System.out.println("Entered Array is : ");
			for(int i=0; i<n; i++)
				System.out.println(a[i]);
		
		int max = a[0];
		int max2 = a[1];

		if(max2 > max){
			int temp = max;
			max = max2;
			max2 = temp;
		}
		
		for(int i=2; i<n; i++){
			if(a[i] > max){
				max2 = max;
				max = a[i];
			}
			else if(a[i] > max2 && a[i] != max){
				max2 = a[i];
			}
		}
		if(max == max2)
			System.out.println("There is no Second Largest Element!!!!");
		else{
			System.out.println("Largest Number: "+max);
			System.out.println("Second Largest Number: "+max2);
		}		
	}
}