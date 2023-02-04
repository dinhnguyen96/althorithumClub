package exerciseWeek2;

public class BoyGirlExercise
{
    public static String boyOrGirl(String s)
    {
        //cach 2 dung Set
        boolean[] checked = new boolean[127];
        String result;
        int count = 0;

        for (int i = 0; i < s.length();i++)
        {
            char value = s.charAt(i);

            if (!checked[value])
            {
                count++;
                checked[value] = true;
            }
        }
        if (count % 2 == 0)
        {
            result = "CHAT WITH HER!";
        }
        else
        {
            result = "IGNORE HIM!";
        }
        return result;


    }
    public static void main(String[] args)
    {
        String s = "xiaodao";

        String result = boyOrGirl(s);

        System.out.println(result);
    }
}
