package Arrays;

import java.util.Scanner;

public class MyStack {

    private int max = 100;
    private int top = 0;
    int[] myStack = new int[max];


    public int[] push() {

        if (top >= max) {
            System.out.print("You can not add any more numbers in stack");
            return myStack;
        } else {
            System.out.print("Give a number: ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println();
            myStack[top] = number;
            top++;
            return myStack;
        }
    }

    public int[] pop() {
        if (top <= 0) {
            System.out.println("Stack Underflow");
            return myStack;
        } else {
            myStack[top] = 0;
            top--;
        }
        return myStack;
    }

    public void peek() {
        if (top == 0)
            System.out.println("The stack is empty. ");
         else
            System.out.println("The peek number of stack is: " + myStack[top - 1] + "\n");

    }

}
