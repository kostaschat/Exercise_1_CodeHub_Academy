package Arrays;

import java.util.Scanner;

public class ExercisesArrays {

    public static void exercisesArrays() {

        String [] menu = new String[6];
        menu[0]="1 -Returns a sub list that contains only the prime numbers.                        *";
        menu[1]="2 -Eliminates the duplicates from a list.                                           *";
        menu[2]="3 -Returns the digits of number in descending order.                               *";
        menu[3]="4 -Implements a version of a stack and its main functionalities (pop, push, peek). *";
        menu[4]="5 -Reverses a string using only a stack.                                           *";
        menu[5]="6 -Checks if a word is symmetric.                                                  *";
        String question = "Choose an option: ";
        Scanner input = new Scanner(System.in);

        //print menu
        System.out.println("************************************************************************************");
        for (int i=0; i<6;i++)
        {
            System.out.println(menu[i]);
        }
        System.out.println("************************************************************************************");
        System.out.print(question);
        int menuAnswer = input.nextInt();
        menuAnswer=checkNumber(menuAnswer);

        if (menuAnswer==1)
           PrimeNumbers.primeNumbers();

        else if(menuAnswer==2)
            EliminateDublicates.eliminateDublicates();

        else if(menuAnswer==3)
            DescendNumbers.descendNumbers();

        else if(menuAnswer==4)
            VersionOfStack.versionOfStack();

        else if(menuAnswer==5)
            ReverseWithStack.reverseWithStack();
        else if(menuAnswer==6)
            ReverseWithStack.reverseWithStack();



    }
    private static int checkNumber(int menuNumber)
    {
        Scanner input =new Scanner(System.in);
        String askNumber="Give a number between 1 and 6: ";


        while (menuNumber>6 ||menuNumber<1)
        {
            System.out.print(askNumber);
            menuNumber=input.nextInt();
        }

        return menuNumber;
    }

}
