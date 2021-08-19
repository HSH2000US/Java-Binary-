import java.util.ArrayList;
import java.util.Scanner;

public class main
{
    private static String reverse = "";
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> bin = new ArrayList<>();
        bin objBinary = new bin();
        String repeat = "yes";



        while (repeat.toUpperCase().equals("YES"))
        {
            objBinary.askBin();
            String binary = objBinary.getBin();
            reverseString(binary);
            if(isBinary(reverse))
            {
                for (int i = 0; i < binary.length(); i++)
                    bin.add(reverse.charAt(i));

                while (bin.size() % 4 != 0)
                    bin.add('0');

                System.out.println(decimal(bin));
            }
            else
            {
                System.out.println("Number entered is not binary");
            }
            System.out.print("Enter another number: Type Yes or No: ");
            repeat = sc.nextLine();


        }





    }

    public static String reverseString(String binary)
    {
        for (int i = binary.length() - 1; i >= 0; i--)
        {
            reverse = reverse + binary.charAt(i);
        }
        return reverse;
    }





    public static int decimal(ArrayList<Character> binary)
    {
        int val = 0;
        for(int i = 0; i < binary.size(); i++)
        {
            if (binary.get(i) == '1')
            {
                val += Math.pow(2, i);
            }
        }
        return val;
    }

    public static boolean isBinary(String s)
    {
        char [] array = new char [s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            array[i] += s.charAt(i);
        }
        for(int i = 0; i < array.length; i++)
        {
            if(Character.isDigit(array[i]))
            {
                int a = Character.getNumericValue(array[i]);
                if(a != 0 && a != 1)
                    return false;
            }
            else
            {
                return false;
            }

        }
        return true;
    }






}
