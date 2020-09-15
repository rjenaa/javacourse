package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text  = scanner.next();

        boolean letterFound = false;

        for(int i = 0; i < text.length(); i++){
            char cureentLetter = text.charAt(i);
            if (cureentLetter == 'A' || cureentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains the letter 'A");

        }
        else{
            System.out.println("This text does not contain the letter 'A");
        }
    }
}
