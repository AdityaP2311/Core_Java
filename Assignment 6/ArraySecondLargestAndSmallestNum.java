import java.util.Scanner;

public class ArraySecondLargestAndSmallestNum{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();

		int max = Integer.MIN_VALUE , max2 = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++){
			if(a[i] > max){
				max2 = max;
				max = a[i];
			}
			else if(a[i] > max2 && a[i] != max){
				max2 = a[i];
			}

			if(a[i] < min){
				min2 = min;
				min = a[i];
			}
			else if(a[i] < min2 && a[i] != min){
				min2 = a[i];
			}
		}
		
		System.out.println("Largest Element is : "+max);
		if(max2 == Integer.MIN_VALUE)
			System.out.println("No distinct second largest element.");
		else
            		System.out.println("Second largest element: " +max2);	
		System.out.println("Smallest Element is : "+min);
		if(min2 == Integer.MAX_VALUE)
			System.out.println("No distinct second smallest element.");
		else
            		System.out.println("Second largest element: " +min2);	


				
}}