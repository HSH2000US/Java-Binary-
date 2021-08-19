import java.util.Scanner;
public class bin
{
    private String bin = "";
    public void askBin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        bin = sc.nextLine();

    }

    public String getBin ()
    {
        return bin;
    }

}
