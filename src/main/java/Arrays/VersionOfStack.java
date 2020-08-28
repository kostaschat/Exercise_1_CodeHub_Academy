package Arrays;
import java.util.Scanner;
public class VersionOfStack {
    public int max=100;
    public static int top=0;

    public static void versionOfStack() {
        Scanner input = new Scanner(System.in);

        String menu1="To add a string in stack, press 1: ";
        String menu2="To remove a string in stack, press 2: ";
        String menu3="To print the first string in stack, press 3: ";
        String menu4="To finish program, press a differend number: ";
        int max=100;
        int [] myStack = new int [max];
        // int top=0;
        boolean flag = true;

        MyStack mstack = new MyStack();

        while (flag)
        {

            System.out.print(menu1 +"\n" +menu2 +"\n" +menu3 +"\n" +menu4 +"\n");
            int answer = input.nextInt();

            if (answer==1)
            {
                mstack.push();


            }
            else if(answer==2)
            {
                mstack.pop();
            }
            else if(answer==3)
            {
                mstack.peek();
            }
            else
                flag =false;
        }

    }

}

