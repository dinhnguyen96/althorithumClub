package test;

import java.util.Scanner;

public class Team {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int problemNumber = input.nextInt();
        int[][] arr = new int[problemNumber][3];
        for (int i = 0; i < problemNumber;i++)
        {
            for (int j = 0; j < 3;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        int solvedProblem = 0;
        for (int i = 0; i < problemNumber;i++)
        {
            int count = 0;
            for (int j = 0; j < 3;j++)
            {
                if (arr[i][j] == 1)
                {
                    count++;
                }
            }
            if (count > 1)
            {
                solvedProblem++;
            }
        }
        System.out.println(solvedProblem);
    }
}
