package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
        addSpaces("HeyWorld");
    }

public static void countWords(String text){
    var words = text.split("");
    int numberOfWords = words.length;

    String message = String.format("Your text contains " + numberOfWords);
    System.out.println(message);
    for(int i = 0; i < numberOfWords; i++){
        System.out.println(words[i]);
    }
}
public static void reverseString(String text){
    for (int i = text.length()-1;i>= 0; i--){
        System.out.println(text.charAt(i));
    }
    }
    public static void addSpaces(String text){
        var modText = new StringBuilder(text);
        for (int i = 0; i < modText.length(); i++){
            if(i!=0 && Character.isUpperCase(modText.charAt(i))){
                modText.insert(i, " ");
            }
        }
        System.out.println(modText);
    }
}

