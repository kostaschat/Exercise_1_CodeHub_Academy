package Arrays;
import java.util.Scanner;

public class DescendNumbers {
    public static void descendNumbers() {
        String insertNumber = "Insert a number: ";


        Scanner input = new Scanner(System.in);
        System.out.print(insertNumber);
        int number = input.nextInt();

        reverseNumber(number);

    }

    private static void reverseNumber(int number) {
        String reverseNumber = "The reverse number: ";
        //count the digits of number
        int count=0;

        String s=String.valueOf(number);
        while(number != 0)
        {
            number /= 10;
            count++;
        }

        System.out.print(reverseNumber);
        for(int i =count-1; i>=0; i--)
            System.out.print(s.charAt(i));



    }

}

