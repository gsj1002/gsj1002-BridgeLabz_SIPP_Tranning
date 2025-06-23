Java Practice Documentation (Day 1 to Day 8)

--------------------------------------------------
Day 1: Java Basic Practice Problems

Topics Covered:
- Hello World Program
- Data types (int, float, char, etc.)
- Basic Input/Output
- Arithmetic operations

Example Code:
----------------------------------------
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
----------------------------------------
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}
--------------------------------------------------

 Day 2: Java Fundamentals

Topics Covered:
- Variables and Constants
- Typecasting
- Operators (Arithmetic, Logical, Relational)

Example Code:
----------------------------------------
public class TypeCastingExample {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Implicit casting
        int c = (int)b; // Explicit casting
        System.out.println("Double: " + b + ", Int: " + c);
    }
}
--------------------------------------------------

 Day 3: Control Flow

Topics Covered:
- if, else if, else
- switch-case
- Loops (for, while, do-while)

Example Code:
----------------------------------------
public class EvenOdd {
    public static void main(String[] args) {
        int number = 7;
        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
----------------------------------------
public class LoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}
--------------------------------------------------

 Day 4: Arrays

Topics Covered:
- 1D Arrays
- 2D Arrays
- Traversing and modifying arrays

Example Code:
----------------------------------------
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
----------------------------------------
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
--------------------------------------------------

 Day 5: Strings

Topics Covered:
- String creation and methods
- Concatenation
- Comparison and manipulation

Example Code:
----------------------------------------
public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + " " + s2;
        System.out.println("Concatenated: " + result);
        System.out.println("Length: " + result.length());
    }
}
--------------------------------------------------

 Day 6: Methods

Topics Covered:
- Method creation
- Method overloading
- Passing parameters and return values

Example Code:
----------------------------------------
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(10, 20));
    }
}
--------------------------------------------------

 Day 7: Built-in Functions

Topics Covered:
- Math class methods
- String class methods
- Arrays utility methods

Example Code:
----------------------------------------
public class BuiltInFunctions {
    public static void main(String[] args) {
        double sqrtVal = Math.sqrt(25);
        int maxVal = Math.max(10, 20);
        System.out.println("Square Root: " + sqrtVal);
        System.out.println("Max: " + maxVal);
    }
}
----------------------------------------
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
--------------------------------------------------

 Day 8: Practice Problems Review

Activities:
- Solved mixed practice questions using all learned topics.
- Reinforced understanding of control structures, strings, arrays, and methods.

--------------------------------------------------

