import java.util.Scanner;
public class HeightConverter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double height_cm = input.nextDouble();
        double total_inches = height_cm / 2.54;
        int feet = (int)(total_inches / 12);
        double inches = total_inches % 12;
        System.out.print("Your Height in cm is " + height_cm + " while in feet is " + feet + " and inches is " + inches );
    }
}
