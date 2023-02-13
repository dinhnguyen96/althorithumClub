package test;

import java.util.Scanner;

public class FootBall {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Toal Score = ");
        int totakScore = input.nextInt();

        String[] team = new String[2];

        int oneTeamScore = 0, twoTeamScore = 0, teamNumber = 0;

        for (int i = 0; i < totakScore;)
        {
            String teamName = input.next().toUpperCase();
            if (teamNumber < 2)
            {
                if (team[0] == null)
                {
                    team[0] = teamName;
                    oneTeamScore++;
                    teamNumber++;
                }
                else
                {
                    if (team[0].equals(teamName))
                    {
                        oneTeamScore++;
                    }
                    else
                    {
                        team[1] = teamName;
                        twoTeamScore++;
                        teamNumber++;
                    }
                }
                i++;
            }
            else
            {
                if (team[0].equals(teamName) || team[1].equals(teamName))
                {
                    if (team[0].equals(teamName))
                    {
                        oneTeamScore++;
                    }
                    else
                    {
                        twoTeamScore++;
                    }
                    i++;
                }
            }

        }
        if (oneTeamScore > twoTeamScore)
        {
            System.out.println(team[0]);
        }
        else if (oneTeamScore < twoTeamScore)
        {
            System.out.println(team[1]);
        }
        else
        {
            System.out.println("");
        }

    }
}
