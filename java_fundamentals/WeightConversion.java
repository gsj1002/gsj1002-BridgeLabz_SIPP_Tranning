import java.util.Scanner;
public class WeightConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds / 2.2;
        System.out.print("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
    }
}
