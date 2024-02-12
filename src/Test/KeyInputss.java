package Test;

import java.util.Scanner;

public class KeyInputss{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Enter First Number==");
        int _numberOne = scanner.nextInt();

        System.out.println("=====Enter Second Number==");
        int _numberTwo = scanner.nextInt();

        int sum = _numberOne + _numberTwo;

        System.out.println("The sum is: " + sum);


    }
}
