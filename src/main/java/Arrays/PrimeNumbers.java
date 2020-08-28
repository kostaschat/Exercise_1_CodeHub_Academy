package Arrays;

import java.util.Scanner;

public class PrimeNumbers {
    public static void primeNumbers() {
        String questionInput="Enter the size of the array that is to be created: ";
        String questionInputElements="Enter the elements of the array: ";


        //User fills the array with numbers.

        Scanner input = new Scanner(System.in);
        System.out.println(questionInput);
        int size = input.nextInt();
        int[] pinakas = new int[size];
        System.out.println(questionInputElements);


        for(int i=0; i<size; i++) {
            pinakas[i] = input.nextInt();
        }
        findPrimes(pinakas);


    }

    private static void findPrimes(int[] pinakas) {
        int temp;
        String answe="Prime numbers are: ";
        System.out.print(answe);
        for (int element:pinakas)
        {


            boolean flag=true;
            if(element==1)
                continue;

            for(int i=2;i<=element/2;i++)
            {
                temp=element%i;
                if(temp==0)
                {
                    flag=false;
                    break;
                }
            }

            if(flag)
                System.out.print(element +"\t" );
        }
    }


}



