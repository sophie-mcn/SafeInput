import java.util.Scanner;

public class CheckOut
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        double totalCost = 0;
        boolean moreItems;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter your item price", 0.5, 10);
            totalCost = totalCost + itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have another item");
        }while(moreItems);

        System.out.printf("Total cost: $%.2f%n", totalCost);
    }
}
