package exerciseWeek2;

import java.util.Scanner;

public class BalloonExercise
{
    public static int sumNumberBalloonReceived(String problems)
    {
        if (problems.length() == 0)
        {
            return 0;
        }
        int balloonSum = 0;

        boolean[] checked = new boolean[127];

        for (int i = 0; i < problems.length();i++)
        {
            char value = problems.charAt(i);
            int problemSolved = 1;

            if (!checked[value])
            {
                 problemSolved++;
                 checked[value] = true;
            }
            balloonSum+= problemSolved;
        }
        return balloonSum;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter problems solved : ");
        String problems = input.nextLine();
        int balloonNumberSum = sumNumberBalloonReceived(problems);
        System.out.println("Tổng số bóng bay các nhóm nhận được : " + balloonNumberSum);


    }
}
