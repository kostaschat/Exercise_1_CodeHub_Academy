package Arrays;
import java.util.Scanner;
public class Symmetric {
    public static void symmetric() {
        Scanner input = new Scanner(System.in);
        String message = "Give a word to check if it's symmetric: ";
        String messageTrue = "It is symetric. ";
        String messageFalse = "It is not symetric. ";
        System.out.print(message);
        String word = input.nextLine();

        if (checkSymetric(word))
            System.out.print(messageTrue);
        else
            System.out.print(messageFalse);
    }

    private static boolean checkSymetric(String word) {
        boolean flag= false;
        String reverseWord="";
        for(int i = word.length()-1; i>=0; i--)
            reverseWord += word.charAt(i);

        if(word.toLowerCase().equals(reverseWord.toLowerCase()))
            flag=true;

        return flag;
    }
}