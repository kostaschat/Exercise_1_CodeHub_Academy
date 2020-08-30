package Arrays;

import java.util.Scanner;

public class DescendNumbers {
    public static void descendNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int number = input.nextInt();
        reverseNumber(number);

    }

    //method to reverse the number
    private static void reverseNumber(int number) {
        //count the digits of number
        int count = 0;
        //convert to string and divide to count the digits of number
        String s = String.valueOf(number);
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.print("The reverse number: ");
        //print the numbers from last to first
        for (int i = count - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }

}

