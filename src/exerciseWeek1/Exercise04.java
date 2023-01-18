package exerciseWeek1;

import java.util.Scanner;

public class Exercise04 {

    public static boolean isExitsCheck(String s, int position, char k)
    {
        for (int i = 0; i < position; i++)
        {
            if (s.charAt(i)== k)
            {
                return true;
            }
        }
        return false;
    }
    public static int stringElementCount(String s, char k)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == k)
            {
                count++;
            }
        }
        return count;
    }
    public static void stringOutput(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != ' ' && !isExitsCheck(s, i,s.charAt(i)))
            {
                int elementCount = stringElementCount(s, s.charAt(i));
                System.out.printf("Phần tử %c xuất hiện %d lần \n", s.charAt(i), elementCount);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi = ");
        String s = input.nextLine();
        stringOutput(s);

    }
}
