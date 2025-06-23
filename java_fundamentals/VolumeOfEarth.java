import java.util.Scanner;
public class VolumeOfEarth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double km = (4.0/3) * 3.14 * radius * radius * radius ;
        double miles = km / 1.6;
        System.out.print("The volume of earth in cubic kilometers is " + km + " and cubic miles is " + miles );
    }
}
