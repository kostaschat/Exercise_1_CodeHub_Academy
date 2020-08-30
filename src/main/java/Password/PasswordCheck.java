package Password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void passwordCheck() {
        Scanner input = new Scanner(System.in);
        String message = "Give a password: \n Contains at least one uppercase character. \n Contains at least one lowercase character. \n Contains at least one number. \n Contains at least one special character."
                + "\n Password length must be at least 8 characters. \n Cannot contain a sequence of 3 same characters.  ";


        System.out.print(message + "\n Enter the password: ");
        String password = input.nextLine();
        int count = 0;
        int[] countPinakas = new int[6];

        if (checkUppercase(password)) {
            count++;
            countPinakas[0] = 1;
        }
        if (checkLowecase(password)) {
            countPinakas[1] = 1;
            count++;
        }
        if (checkNumber(password)) {
            countPinakas[2] = 1;
            count++;
        }
        if (checkSpecialCharacter(password)) {
            countPinakas[3] = 1;
            count++;
        }
        if (checkNumberOfCharacters(password)) {
            countPinakas[4] = 1;
            count++;
        }
        if (checkDuplicates(password)) {
            countPinakas[5] = 1;
            count++;
        }

        if (count == 6) {
            System.out.print("Very strong password");
        } else if (count >= 3) {
            if ((countPinakas[4] == 1) && (countPinakas[5] == 1)) {
                System.out.print("Strong password");

            }
            else if (((countPinakas[2] == 1) && (countPinakas[5] == 1)) || ((countPinakas[3] == 1) && (countPinakas[5] == 1))) {
                System.out.print("Password OK");
            }

        } else
            System.out.println("Password not OK");

    }

    private static boolean checkUppercase(String password) {

        if (password.equals(password.toLowerCase()))
            return false;
        else
            return true;
    }

    private static boolean checkLowecase(String password) {
        if (password.equals(password.toUpperCase()))
            return false;
        else
            return true;
    }

    private static boolean checkNumber(String password) {


        if (password.matches(".*\\d.*"))
            return true;
        else
            return false;
    }

    private static boolean checkSpecialCharacter(String password) {
        Pattern pattern = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher specialCharacters = pattern.matcher(password);

        if (specialCharacters.find())
            return true;
        else
            return false;
    }

    private static boolean checkNumberOfCharacters(String password) {
        String pattern = ".{8,}$";

        if (password.matches(pattern))
            return true;
        else
            return false;
    }


    private static boolean checkDuplicates(String password) {
        String pattern = "^(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|nop|opq|pqr|qrs|rst|stu"
                + "|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678|789)$";

        boolean flag1 = false;
        boolean flag2 = false;
        String passwordSubstring;

        for (int i = 0; i < password.length() - 2; i++) {
            //check if it has sequence of 3 same characters
            if ((password.charAt(i) == password.charAt(i + 1)) && (password.charAt(i) == password.charAt(i + 2))) {

                flag2 = true;
                break;
            } else
                flag2 = false;

            //check if it has sequence of 3 consecutive characters
            passwordSubstring = password.substring(i, i + 3);

            if (passwordSubstring.matches(pattern)) {
                flag1 = true;
                break;
            } else
                flag1 = false;
        }
        // return true if they are not sequence and consecutive characters
        if (flag1 == false && flag2 == false)
            return true;
        else
            return false;
    }
}


