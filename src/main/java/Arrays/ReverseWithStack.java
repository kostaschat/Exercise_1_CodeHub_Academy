package Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWithStack {
    public static void reverseWithStack() {
        Stack <Character> myStack = new Stack <Character>();
        Scanner input = new Scanner(System.in);

        String message = "Give a word: ";
        System.out.print(message);
        String word = input.nextLine();

        for(int i = 0; i< word.length(); i++)
            myStack.push(word.charAt(i));

        for(int i = 0; i< word.length(); i++)
            System.out.print(myStack.pop());

    }

}
