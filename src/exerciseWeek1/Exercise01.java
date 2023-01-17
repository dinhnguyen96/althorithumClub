package exerciseWeek1;

import java.util.Scanner;

public class Exercise01 {

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
    public static void arrayInput(int[] array, int n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n;)
        {
            System.out.print("array["+i+"] = ");
            array[i] = input.nextInt();
            if (isExitsCheck(array, i, array[i]))
            {
                System.out.println("Đã có trong mảng");
            }
            else
            {
                i++;
            }
        }
    }
    public static void arrayOutput(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i] + " ");
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
