// 1  How to find common elements in three sorted array? 

import java.util.Scanner;

class Qus1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements for first array:- ");
        for (int i = 0; i < size1; i++)
		{
            arr1[i] = sc.nextInt();
        }

  
        int[] arr2 = new int[size1];
        System.out.println("Enter the elements for second array:- ");
        for (int i = 0; i < size1; i++)
	 	{
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[size1];
        System.out.println("Enter the elements for third array:- ");
        for (int i = 0; i < size1; i++)
		{
            arr3[i] = sc.nextInt();
        }


        System.out.println("Common elements in the three arrays are:- ");
        commonelements(arr1, arr2, arr3);
		sc.close();
    }

    public static void commonelements(int[] arr1, int[] arr2, int[] arr3) 
	{
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;

        while (ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) 
		{
            if (arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3]) 
			{
                System.out.print(arr1[ptr1] + " ");
                ptr1++;
                ptr2++;
                ptr3++;
            } else if (arr1[ptr1] < arr2[ptr2]) 
			{
                ptr1++;
            } else if (arr2[ptr2] < arr3[ptr3]) 
			{
                ptr2++;
            } else 
			{
                ptr3++;
            }
        }
    }
}