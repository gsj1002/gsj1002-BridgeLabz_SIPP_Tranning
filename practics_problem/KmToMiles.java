// 10. Convert Kilometers to Miles
// Write a program that takes the distance in kilometers as input from the user and converts it into miles using the formula: Miles = Kilometers * 0.621371.
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles");
    }
}