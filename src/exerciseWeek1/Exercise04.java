package exerciseWeek1;

import java.util.Scanner;

public class Exercise04 {

    public static void arrayInput(int[] array, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = input.nextInt();
        }
    }
    public static boolean isExitsCheck(int[] array, int position, int k)
    {
        for (int i = 0; i < position; i++)
        {
            if (array[i] == k)
            {
                return true;
            }
        }
        return false;
    }
    public static int arrayElementCount(int[] array, int n, int k)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (array[i] == k)
            {
                count++;
            }
        }
        return count;
    }
    public static void arrayOutput(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (!isExitsCheck(array, i, array[i]))
            {
                int elementCount = arrayElementCount(array, n, array[i]);
                System.out.printf("Phần tử %d xuất hiện %d lần \n", array[i], elementCount);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = input.nextInt();
        int[] array = new int[n];
        arrayInput(array, n);
        arrayOutput(array,n);

    }
}
