import java.util.Scanner;

public class  ArrayOperationsUsingSwitch{

	public static void display(int arr[]){
		for(int x : arr)
			System.out.println(x);
	}
	public static int average(int a[],int n){
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += a[i];
		}
		int avg = sum/n;
		return avg;
	}
	public static int max(int a[]){
		int max = a[0];
		for(int x : a){
			if(max < x)
				max = x;
		}
		return max;
	}
	public static int search(int a[],int key,int n){
		for(int i=0; i<n; i++){
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static int occurence(int a[],int key,int n){
		int cnt = 0;
		for(int i=0; i<n; i++){
			if(a[i] == key )
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N:");
		int n = sc.nextInt();
		
		int a[]	= new int[n];
		System.out.println("Enter Array of "+n+" Elements :");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		while(true){
			System.out.println("""
				1. Print Array elements
				2. Calculate Average of Array elements
				3. Find Max of Array
				4. Search an element in Array
				5. Count Occurrence of an element in Array
				6. Exit
				Enter a Choice : 
			""");
			int ch  = sc.nextInt();
			switch(ch){
				case 1 -> display(a);
				case 2 -> System.out.println("Average is : "+average(a,n));
				case 3 -> System.out.println("Maximum is : "+max(a));
				case 4 ->{
					System.out.println("Enter a Search Element : ");
					int key = sc.nextInt();

					if(search(a,key,n) == -1)
						System.out.println(key+" is Not Found in Array!!!!");
					else
						System.out.println(key+" is found at Position :"+search(a,key,n));
				}
				case 5 ->{
					System.out.println("Enter a Number to Check Occurence : ");
					int key = sc.nextInt();
					System.out.println("Occurence of "+key+" is : "+occurence(a,key,n));
				}
				case 6 -> System.exit(0);			
			}
		}
	}	
}