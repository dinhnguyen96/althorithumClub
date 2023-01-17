package exerciseWeek1;

import java.util.Scanner;

public class Exercise02
{

    public static void arrayInput(int[] array, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = input.nextInt();
        }
    }
    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void arraySortAfterPositionDisplay(int[] array, int n)
    {;
        int minPosition;
        for (int i = 0; i < n - 1; i++)
        {
            minPosition = i;
            for (int j = i+1; j < n; j++)
            {
               if (array[j] < array[minPosition])
               {
                   minPosition = j;
               }
            }
            swap(array, i, minPosition);
        }

    }

    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.print("Nhập n = ");
         int n = input.nextInt();
         int[] array = new int[n];
         arrayInput(array, n);
         int[] initElement = new int[n];
         int[] initElementPosition = new int[n];
         for (int i = 0; i < n;i++)
         {
             initElement[i] = array[i];
         }
         arraySortAfterPositionDisplay(array,n);
         for (int i = 0; i < n;i++)
         {
             int j = 0;
             while (j < n && initElement[j] != array[i])
             {
                 j++;
             }
             initElementPosition[i] = j;
         }
         for (int i = 0; i < n;i++)
         {
             System.out.println(initElementPosition[i] + " ");
         }
    }
}