package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please input a season of they year!");
        String season = scanner.nextLine();

        System.out.println("Please enter a whole number now");
        int wholeNum = scanner.nextInt();

        System.out.println("Please enter in an adjective");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " " + season + " day, " +
                "I drink a minimum of " + wholeNum + " cups of coffee");

    }
}
