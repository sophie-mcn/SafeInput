import java.util.Scanner;

public class Reggie
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        String option = "";

        String SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + SSN);

        String mNumber = SafeInput.getRegExString(in, "Enter your student id number (M-number)", "^(M|m)\\d{8}$");
        System.out.println("Your student id number is: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");
        switch (menuChoice) {
            case "O", "o":
                option = "open";
                break;
            case "V", "v":
                option = "view";
                break;
            case "S", "s":
                option = "save";
                break;
            default:
                option = "quit";
                break;
        }
        System.out.println("You chose to " + option);
    }
}
