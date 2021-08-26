//Java Program to print the elements of an array in reverse order(Scanner)

import java.util.Scanner;

public class Prgrm2a {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Size of array:");
		int a=s.nextInt();
		int[] arr=new int[a];
		
		System.out.println("Enter array Elements:");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println();  
        		System.out.println("Array in reverse order: ");  
        
        		for (int i = a-1; i >= 0; i--) 
		{  
            			System.out.println(arr[i]);  
		}
	}

}
