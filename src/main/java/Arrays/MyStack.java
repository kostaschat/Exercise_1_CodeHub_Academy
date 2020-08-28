package Arrays;

import java.util.Scanner;

public class MyStack {

    private int max=100;

    private  int top=0;

    int [] myStack = new int [max];


    public   int [] push() {
        String msg="You can not add any more numbers in stack";
        if (top>=max)
        {
            System.out.print(msg);
            return myStack;
        }
        else
        {
            String pushNumber = "Give a number: ";
            System.out.print(pushNumber);
            Scanner input = new Scanner(System.in);
            int number= input.nextInt();
            myStack[top]=number;
            top++;
            System.out.println("TOP IS " +top);
            return myStack;
        }
    }

    public  int []  pop() {
        String message= "Stack Underflow";
        if (top <= 0) {
            System.out.println(message);
            return myStack;
        }
        else{
            myStack[top]=0;
            top--;

        }

        return myStack;
    }

    public  void peek() {
        String messageEmprty = "The stack is empty. ";
        if(top==0)
        {
            System.out.println(messageEmprty );
        }
        else
        {
            String message = "The peek number of stack is: ";
            System.out.println(message +myStack[top-1] +"\n");
        }
    }


}
