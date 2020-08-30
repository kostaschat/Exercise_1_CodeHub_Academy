package Arrays;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWithStack {
    public static void reverseWithStack() {
        Stack<Character> myStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Give a word: ");
        String word = input.nextLine();

        //fill stack with characters from word
        for (int i = 0; i < word.length(); i++)
            myStack.push(word.charAt(i));
        System.out.print("Reverse word is: ");
        //print one by one the characters
        for (int i = 0; i < word.length(); i++)
            System.out.print(myStack.pop());

    }
}
