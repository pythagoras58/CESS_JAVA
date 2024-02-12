package DayTwo;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instantiation
        System.out.println("===Hey, input a value===");
        int score = scanner.nextInt();
        System.out.println("Hey, your value is " + score);
    }
}
