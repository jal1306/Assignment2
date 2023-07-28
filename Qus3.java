// 3 How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? 

import java.util.Arrays;
import java.util.Scanner;
class Qus3
{
	int Smallest(int arr[], int n)
	{
		int res = 1; 
		Arrays.sort(arr);
	
		for (int i = 0; i < n; i++)
		{
			if(arr[i] > res)
			{
				return res;
			}
			else
			{
				res+=arr[i];
			}
		}
		return res;
	}

	public static void main(String[] args)
	{
		Qus3 small = new Qus3();
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements for first array:- ");
        for (int i = 0; i < size1; i++)
		{
            arr1[i] = sc.nextInt();
        }
		int n1 = arr1.length;
		System.out.println(small.Smallest(arr1, n1));
	}
}