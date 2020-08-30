package Arrays;

import java.util.Scanner;

public class ExercisesArrays {

    public static void exercisesArrays() {

        String[] menu = new String[6];
        menu[0] = "1 -Returns a sub list that contains only the prime numbers.                        *";
        menu[1] = "2 -Eliminates the duplicates from a list.                                          *";
        menu[2] = "3 -Returns the digits of number in descending order.                               *";
        menu[3] = "4 -Implements a version of a stack and its main functionalities (pop, push, peek). *";
        menu[4] = "5 -Reverses a string using only a stack.                                           *";
        menu[5] = "6 -Checks if a word is symmetric.                                                  *";
        Scanner input = new Scanner(System.in);

        //print menu
        System.out.println("\n" +"************************************************************************************");
        for (int i = 0; i < 6; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("************************************************************************************");
        System.out.print("Choose an option: ");
        int menuAnswer = input.nextInt();
        menuAnswer = checkNumber(menuAnswer);
        //user choose one option from menu
        if (menuAnswer == 1)
            PrimeNumbers.primeNumbers();

        else if (menuAnswer == 2)
            EliminateDuplicates.eliminateDuplicates();

        else if (menuAnswer == 3)
            DescendNumbers.descendNumbers();

        else if (menuAnswer == 4)
            VersionOfStack.versionOfStack();

        else if (menuAnswer == 5)
            ReverseWithStack.reverseWithStack();

        else if (menuAnswer == 6)
            Symmetric.symmetric();
    }
    // check if value is between 1 and 6
    private static int checkNumber(int menuNumber) {
        Scanner input = new Scanner(System.in);

        while (menuNumber > 6 || menuNumber < 1) {
            System.out.print("Give a number between 1 and 6: ");
            menuNumber = input.nextInt();
        }
        return menuNumber;
    }

}
