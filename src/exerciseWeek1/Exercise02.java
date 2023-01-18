package exerciseWeek1;

import java.util.Arrays;
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
    public static String arraySortAfterPositionDisplay(int[] array, int n)
    {;
        int[] initElementPosition = {0,1,2,3,4};
        for (int i = 0; i < n - 1; i++)
        {
            int minPosition = i,minElement = array[i];
            for (int j = i+1; j < n; j++)
            {
               if (array[j] < array[minPosition])
               {
                   minPosition = j;
               }
            }
            int temp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = temp;

            if (minElement != array[i])
            {
                int positionTemp = initElementPosition[i];
                initElementPosition[i] = initElementPosition[minPosition];
                initElementPosition[minPosition] = positionTemp;
            }
        }
        return Arrays.toString(initElementPosition);

    }

    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.print("Nhập n = ");
         int n = input.nextInt();
         int[] array = new int[n];
         arrayInput(array, n);
         String result = arraySortAfterPositionDisplay(array,n);
         System.out.println(result);
    }
}