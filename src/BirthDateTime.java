import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minute;

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch (month)
            {
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
                case 4, 6, 9, 11:
                day =  SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;
                default:
                    day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
            }
        hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);

        System.out.println("Your date of birth is: " + month + "/" + day + "/" + year + " at " + hour + ":" + minute);

    }

}
