package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void primeNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> table = new ArrayList<>();
        char continueAnswer= ' ';

        do
        {
            System.out.print("Enter a number: ");
            table.add(input.nextInt());
            System.out.print("Do you want to add more, press y or Y to continue: ");
            continueAnswer = input.next().charAt(0);
            
        }while((continueAnswer== 'y') ||  (continueAnswer== 'Y'));
        findPrimes(table);

    }

    private static void findPrimes(List<Integer> table) {
        int temp;
        System.out.print("Prime numbers are: ");
        //check every number if it is prime
        for (int element : table) {
            boolean flag = true;
            if (element == 1)
                continue;
            for (int i = 2; i <= element / 2; i++) {
                temp = element % i;
                if (temp == 0) {
                    flag = false;
                    break;
                }
            }
            // if flag is true then the number is prime else go to other number
            if (flag)
                System.out.print(element + "\t");
        }
    }
}



