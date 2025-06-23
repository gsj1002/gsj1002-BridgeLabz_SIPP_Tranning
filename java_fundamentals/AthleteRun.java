import java.util.Scanner;
public class AthleteRun
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3; // in meters
        double totalDistance = 5000; // 5 km = 5000 meters
        double rounds = totalDistance / perimeter;

        System.out.print("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
