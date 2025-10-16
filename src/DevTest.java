import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = getNonZeroLenString(in, "Please enter your name");
        System.out.println("Hello " + name + "!");
    }

    /**
     * a method that prompts for and returns a string response with at least one character
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt a prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't

        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();

            if (retString.isEmpty())
            {
                System.out.println("Please enter at least one character");
            }
        }while(retString.isEmpty());

        return retString;

    }

}