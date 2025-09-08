import java.util.Scanner;

public class ArrayPrimeNumDisplay{
	
	public static boolean isPrime(int num) {
        	if (num < 2)
			 return false;
        	if (num == 2 || num == 3)
			 return true;
        	if (num % 2 == 0 || num % 3 == 0)
			 return false;

       	 	for (int i = 5; i <= Math.sqrt(num); i += 6) {
            		if (num % i == 0 || num % (i + 2) == 0)
                		return false;
        	}
        	return true;
    	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N: ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
	
		System.out.println("Enter Array of "+n+" Elements: ");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
	
		int prime[] = new int[n];
        	int p = 0;  

        	for (int i = 0; i < n; i++) {
            		if (isPrime(a[i]))
                		prime[p++] = a[i];
	        }

                System.out.println("\nPrime numbers stored in prime[] array are:");
        	if (p == 0)
            		System.out.println("No prime numbers found!");
    	 	else {
            		for (int i = 0; i < p; i++)
                		System.out.print(prime[i] + " ");
            	}
	}
}

