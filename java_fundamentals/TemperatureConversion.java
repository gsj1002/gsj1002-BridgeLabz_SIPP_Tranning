import java.util.Scanner;
public class TemperatureConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.print("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}
