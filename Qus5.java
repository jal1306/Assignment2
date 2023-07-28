// 5 How to find if there is a sub array with sum equal to zero?
import java.util.Arrays;
import java.util.Scanner;
public class Qus5 
{
	public static boolean subArrayExists(int arr[], int n)
	{
		for (int i = 0; i < n; i++) 
		{
			int sum = arr[i];
			if (sum == 0)
			{
				return true;
			}
			for (int j = i + 1; j < n; j++) 
			{
				sum += arr[j];
				if (sum == 0)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size1 = sc.nextInt();
        int[] arr = new int[size1];
        System.out.println("Enter the elements for first array:- ");
        for (int i = 0; i < size1; i++)
		{
            arr[i] = sc.nextInt();
        }

		int N = arr.length;

		if (subArrayExists(arr, N))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
	}
}