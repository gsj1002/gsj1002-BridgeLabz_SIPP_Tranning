import java.util.Scanner;
public class FindAge
{
    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	int current_year = 2025;
	int birth_year = input.nextInt();
	int age = current_year - birth_year;
	System.out.print("harry's age in 2025 is " + age);
	
    }
}