import java.util.Scanner;
public class TemperatureConversion1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.print("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}
