package Algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class ExercisesAlgorithms {

    public static void exercisesAlgorithms(){

    String [] menu = new String[6];
    menu[0]="1 -Calculates the factorial of a number n (n!).                                *";
    menu[1]="2 -Finds the maximum value of n as int so that the calculated output is valid. *";
    menu[2]="3 -Returns true or false depending on if the number is prime or not.           *";
    menu[3]="4 -A given n, it calculates the following value: 1 + ½ + ⅓ + … + 1/n.          *";
    menu[4]="5 -Counts the digits of a long number.                                         *";
    menu[5]="6 -Given a positive float number, print its decimal part.                      *";


    String answerMenu="Choose one option from menu: ";
    String question="Give a number: ";
    String answer="Answer for this number is: ";
    Scanner input =new Scanner(System.in);
    int number;
    long longNumber;
    float floatNumber;



    //print menu
        System.out.println("********************************************************************************");
        for (int i=0; i<6;i++)
    {
        System.out.println(menu[i]);
    }
        System.out.println("********************************************************************************");

    //read answer from menu and check if it's a proper value.
        System.out.print(answerMenu);
    int menuAnswer = input.nextInt();
    menuAnswer=checkNumber(menuAnswer);


        if (menuAnswer==1)
    {
        // ask a number from user
        System.out.print(question);
        number= input.nextInt();
        System.out.println(answer + calculateNumber(number));
    }
        else if (menuAnswer==2)
    {
        // ask a number from user
        System.out.print(question);
        number= input.nextInt();

    }
        else if (menuAnswer==3)
    {
        // ask a number from user
        System.out.print(question);
        number= input.nextInt();
        if(checkPrime(number))
        {
            System.out.println(" True");
        }
        else
            System.out.println(" False");

    }
        else if (menuAnswer==4)
    {
        // ask a number from user
        System.out.print(question);
        number= input.nextInt();
        System.out.println(answer +calculateDevide(number));

    }
        else if (menuAnswer==5)
    {
        System.out.print(question);
        longNumber= input.nextLong();
        System.out.println(answer +countTheDigits(longNumber));

    }
        else if (menuAnswer==6)
    {
        System.out.print(question);
        floatNumber= input.nextFloat();

        System.out.println(answer +decimalPart(floatNumber));

    }



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

    private static BigInteger calculateNumber(int number)
    {
        BigInteger result= BigInteger.ONE;

        for(int i=1; i <= number; i++)
            result =result.multiply(BigInteger.valueOf(i));

        return result;
    }

    private static boolean checkPrime(int number)
    {
        if (number%2==0)
            return false;

        for(int i=3; i<=Math.sqrt(number); i+=2) {
            if(number%i==0)
                return false;
        }
        return true;

    }

    private static double calculateDevide(int number){

        double sum=0.0;

        for (double i=1; i<=number; i++)
            sum += 1/i;
        return sum;
    }

    private static int countTheDigits(long number){

        int count=0;
        while(number != 0)
        {
            number /= 10;
            count++;
        }
        return count;
    }

    private static String decimalPart(float floatNumber){

        String doubleAsString = String.valueOf(floatNumber);
        int indexOfDecimal = doubleAsString.indexOf(".");
        String digits=doubleAsString.substring(indexOfDecimal);

        return digits;
    }

}


