package exerciseWeek1;

import java.util.Scanner;

public class Exercise03 {


    public static void arrayInput(int[] array, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            System.out.print("array["+i+"] = ");
            array[i] = input.nextInt();
        }
    }
    public static void arrayOutput(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i] + " ");
        }
    }

    public static void sortedArray(int[] array, int n)
    {
        int[] sortedArray = new int[1000];
        boolean[] checked = new boolean[1000];
        int count = 0;

        for (int i = 0; i < n; i++)
        {
            sortedArray[array[i]] = array[i];
            checked[array[i]] = true;
        }
        for (int i = 0; i < sortedArray.length;i++)
        {
            if (count >= n)
            {
                break;
            }
            if (checked[i])
            {
                System.out.println(sortedArray[i] + " ");
                count++;
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
        System.out.println("Mảng ban đầu :");
        arrayOutput(array,n);
        System.out.println("Mảng sau khi sắp xếp :");
        sortedArray(array, n);
    }
}
