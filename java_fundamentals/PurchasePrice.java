import java.util.Scanner;
public class PurchasePrice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.print("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice );
    }
}
