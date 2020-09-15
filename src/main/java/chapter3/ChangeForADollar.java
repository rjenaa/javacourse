package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Change for a Dollar game, \n Please enter the amount of pennies.");
        int pennies = scanner.nextInt();

        System.out.println("Now enter an amount of nickels:");
        int nickels = scanner.nextInt();

        System.out.println("Now enter an amount of dimes:");
        int dimes = scanner.nextInt();

        System.out.println("Now enter an amount of quarters");
        int quarters = scanner.nextInt();

        int sum;
        int dollar = 100;

        sum = pennies + (nickels*5) + (dimes*10) + (quarters*25);

        int change = dollar - sum;

        if (change == 0){
            System.out.println("Congratz! You win");
        }
        else if(change < 0){
            change = change * -1;
            System.out.println("Sorry, you went over by " + change + " cents");
        }
        else{
            System.out.println("Sorry, you were short by " + change + " cents");
        }

    }
}
