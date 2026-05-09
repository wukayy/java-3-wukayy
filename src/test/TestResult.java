package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        Exercise exercise = new Exercise();

        boolean result = exercise.Calculate(number);

        if (result) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }
    }
}
