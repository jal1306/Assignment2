// 4 How to rearrange array in alternating positive and negative number?

import java.util.Arrays;
import java.util.Scanner;
class Qus4
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements for array:- ");
        for (int i = 0; i < size1; i++)
		{
            arr1[i] = sc.nextInt();
        }
		
		int n = arr1.length;
        int i = -1, temp = 0;
        for (int j = 0; j < n; j++) 
		{
            if (arr1[j] < 0) 
			{
                i++;
                temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
        }
		
        int pos = i+1, neg = 0;
        while (pos < n && neg < pos && arr1[neg] < 0) 
		{
            temp = arr1[neg];
            arr1[neg] = arr1[pos];
            arr1[pos] = temp;
            pos++;
            neg += 2;
        }
        System.out.println(Arrays.toString(arr1));
    }
}