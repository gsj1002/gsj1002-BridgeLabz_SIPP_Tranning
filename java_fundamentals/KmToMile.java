import java.util.Scanner;
public class KmToMile
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double mile = 1.6 ;
        double miles = km / mile ;
        System.out.print("The total miles is " + miles + " mile for the given " + km + " km ");
    }
}
