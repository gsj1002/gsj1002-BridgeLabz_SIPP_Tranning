import java.util.Scanner;
public class SquareSide
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int perimeter = input.nextInt();
        int side = perimeter / 4;
        System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter );
    }
}
