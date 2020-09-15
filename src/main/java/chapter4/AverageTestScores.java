package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numberofStundets = 24;
        int numberofTests = 4;

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numberofStundets; i++){
            double total = 0;
            for (int j = 0; j < numberofTests; j++){
                System.out.println("Enter the score " + (j+1));
                double score = scanner.nextDouble();
                total += score;
            }
            double average = total/numberofTests;
            System.out.println("The average for students " + (i+1) + " is " + average);
        }
        scanner.close();
    }
}
