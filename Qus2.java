// 2 How find the first repeating element in an array of integers? 

import java.util.*;
public class Qus2 
{
	public static int firstRepeatingElement(int[] arr, int n) 
	{
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{	
				if (arr[i] == arr[j]) 
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{	
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) 
		{
            arr_size = sc.nextInt();
        }
		
        int[] arr = new int[arr_size];
  
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) 
		{
            if (sc.hasNextInt()) 
			{
                arr[i] = sc.nextInt();
            }
        }
		
		int n = arr.length;
		int index = firstRepeatingElement(arr, n);

		if (index == -1) 
		{
			System.out.println("No repeating element found!");
		}
		else 
		{
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}