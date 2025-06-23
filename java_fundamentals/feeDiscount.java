import java.util.Scanner;
public class feeDiscount
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double fee = input.nextInt();
        double discount_percent = input.nextInt();
        double discount_fee = fee * discount_percent / 100 ;
        System.out.print("The fee is INR " + fee + " and discount_fee is " + discount_fee );
    }
}