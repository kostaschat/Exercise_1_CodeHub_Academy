package Arrays;
import java.util.Scanner;
public class Symmetric {
    public static void symmetric() {
        Scanner input = new Scanner(System.in);
        System.out.print("Give a word to check if it's symmetric: ");
        String word = input.nextLine();

        if (checkSymmetric(word))
            System.out.print("It is symmetric. ");
        else
            System.out.print("It is not symmetric. ");
    }

    private static boolean checkSymmetric(String word) {
        boolean flag= false;
        String reverseWord="";
        for(int i = word.length()-1; i>=0; i--)
            reverseWord += word.charAt(i);

        if(word.toLowerCase().equals(reverseWord.toLowerCase()))
            flag=true;

        return flag;
    }
}