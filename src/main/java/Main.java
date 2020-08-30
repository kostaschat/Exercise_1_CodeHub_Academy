import Algorithms.ExercisesAlgorithms;
import Arrays.ExercisesArrays;
import Password.PasswordCheck;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu1 = "Exercises algorithms, press 1.";
        String menu2 = "Exercises strings, press 2.";
        String menu3 = "Exercises password, press 3.";
        //print menu for the user
        System.out.println(menu1 +"\n" +menu2 +"\n" +menu3 );
        System.out.print("Choose an option: ");
        int answer = input.nextInt();
        if (answer==1)
            ExercisesAlgorithms.exercisesAlgorithms();
        else if (answer==2)
            ExercisesArrays.exercisesArrays();
        else if (answer==3)
            PasswordCheck.passwordCheck();



    }
}

