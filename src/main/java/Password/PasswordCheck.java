package Password;
import java.util.Scanner;

public class PasswordCheck {
    public static void passwordCheck() {
        Scanner input = new Scanner(System.in);
        String message = "Give a password: \n Contains at least one uppercase character. \n Contains at least one lowercase character. \n Contains at least one number. \n Contains at least one special character."
                + "\n Password length must be at least 8 characters. \n Cannot contain a sequence of 3 same characters.  ";


        System.out.print(message);
        String password =input.nextLine();
        int count =0;
        int [] countPinakas= new int[6] ;


        if (checkUppercase(password))
        {
            count++;
            countPinakas[0]=1;         
        }
        if(checkLowecase(password))
        {
            countPinakas[1]=1;
            count++;
        }
        if(checkNumber(password))
        {
            countPinakas[2]=1;
            count++;
        }
        if(checkSpecialCharacter(password))
        {
            countPinakas[3]=1;
            count++;
        }
        if(checkNumberOfCharacters(password))
        {
            countPinakas[4]=1;
            count++;
        }
        if(checkDuplicates(password))
        {
            countPinakas[5]=1;
            count++;
        }


        if (count>=3)
            System.out.println("Password OK");
        else
            System.out.println("Password not OK");


        if(((countPinakas[2]==1) && (countPinakas[5]==1)) || ((countPinakas[3]==1) &&(countPinakas[5]==1) ))
        {
            System.out.print("Password OK");
        }
        else if((countPinakas[4]==1) && (countPinakas[5]==1))
        {
            System.out.print("Strong password");
        }
        else if(count==6)
        {
            System.out.print("Very Strong password");
        }
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

        String pattern = "^(?=.*[0-9])(?=\\S+$).{8,}$";
        if(password.matches(pattern))
            return true;
        else
            return false;
    }

    private static boolean checkSpecialCharacter(String password) {
        
        String pattern =  "^(?=.*[@#$%^&!.+=])(?=\\S+$).{8,}$";
        if(password.matches(pattern))
            return true;
        else
            return false;
    }

    private static boolean checkNumberOfCharacters(String password) {
        
        String pattern = ".{8,}";
        if(password.matches(pattern))
            return true;
        else
            return false;
    }

    private static boolean checkDuplicates(String password) {
        String pattern = "^(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|nop|opq|pqr|qrs|rst|stu"
                + "|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678|789)$";

        for (int i =0; i< password.length()-2; i++)
        {
            if( (password.charAt(i)==password.charAt(i+1)) && (password.charAt(i)==password.charAt(i+2)) && (password.matches(pattern))  )
            {
                return true;
            }
        }
        return false;
    }
}


