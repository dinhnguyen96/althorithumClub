package test;

import java.util.Scanner;

public class Children {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int childNumber = input.nextInt();

        int candiesNumber = input.nextInt();

        int[] childsCandies = new int[childNumber];// mang keo cua nhung dua tre

        int[] childsPosition = new int[childNumber];// mang danh dau

        for (int i = 0; i < childNumber;i++)
        {
            childsPosition[i] = i;
        }

        for (int i = 0; i < childNumber;i++)
        {
            childsCandies[i] = input.nextInt();
        }

        int[] result = new int[childsCandies.length];
        int k = 0;

        while (childNumber != 0)
        {
            if (childsCandies[0] > candiesNumber)
            {
                childsCandies[0] = childsCandies[0] - candiesNumber;
                int initCandies = childsCandies[0];
                int initPosition = childsPosition[0];

                int i = 0;
                while (i < childNumber - 1)
                {
                    childsCandies[i] = childsCandies[i+1];
                    childsPosition[i] = childsPosition[i+1];// cap nhat mang danh dau
                    i++;
                }
                childsCandies[i] = initCandies;
                childsPosition[i] = initPosition;
            }
            else
            {
                result[k++] = childsPosition[0];
                int i = 0;
                while (i < childNumber - 1)
                {
                    childsCandies[i] = childsCandies[i+1];
                    childsPosition[i] = childsPosition[i+1];
                    i++;
                }
                childNumber--;
            }
        }
        System.out.println(result[result.length-1]+1);



    }
}
