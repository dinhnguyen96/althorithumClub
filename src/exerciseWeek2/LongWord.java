package exerciseWeek2;

public class LongWord {


    public static String specialAbbreviationWord(String s)
    {
        if (s.length() <= 10)
        {
            return s;
        }
        int lengthOfCenterCharacter = s.length() - 2;

        String fisrtCharacter = String.valueOf(s.charAt(0));

        String endCharacter = String.valueOf(s.charAt(s.length()-1));

        return fisrtCharacter + lengthOfCenterCharacter + endCharacter ;

    }

    public static void main(String[] args)
    {
         String specialAbbreviation = specialAbbreviationWord("pneumonoultramicroscopicsilicovolcanoconiosis");

         System.out.println("After specialAbbreviation  :  " + specialAbbreviation);
    }
}
