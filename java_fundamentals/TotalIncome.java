import java.util.Scanner;
public class TotalIncome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.print("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome );
    }
}
