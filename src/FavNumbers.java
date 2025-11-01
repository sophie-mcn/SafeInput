import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your favourite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favourite double");
        System.out.println("Your favourite integer is " + favInt + " and your favourite double is " + favDouble);
    }
}
