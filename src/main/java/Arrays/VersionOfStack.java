package Arrays;

import java.util.Scanner;

public class VersionOfStack {

    public static void versionOfStack() {
        Scanner input = new Scanner(System.in);
        String menu1 = "To add a string in stack, press 1: ";
        String menu2 = "To remove a string in stack, press 2: ";
        String menu3 = "To print the first string in stack, press 3: ";
        String menu4 = "To finish program, press a different number: ";
        String question = "Choose an option: ";
        boolean flag = true;

        MyStack mystack = new MyStack();
        while (flag) {
            System.out.print(menu1 + "\n" + menu2 + "\n" + menu3 + "\n" + menu4 + "\n");
            System.out.print(question);
            int answer = input.nextInt();

            if (answer == 1) {
                mystack.push();
            } else if (answer == 2)
                mystack.pop();
            else if (answer == 3)
                mystack.peek();
            else
                flag = false;
        }

    }
}

