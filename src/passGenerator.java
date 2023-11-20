
import java.util.Random;
import java.util.Scanner;

public class passGenerator {

    public passGenerator( ) {
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSSTUVWXYZ";
        String special_char = "<>{}!@#$%^&*()_+=";
        String numbers = "012345789";

        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        //For Uppe Case:
        System.out.println("Press 1 to include UPPERCASE characters in the password, else press 0 ");
        int isupper = sc.nextInt();
        boolean upper = true;
        if (isupper != 1)
        {
            upper = false;
        }

        //ends here

        //For Lower Case:
        System.out.println("Press 1 to include LOWERCASE characters in the password, else press 0 ");
        int islower = sc.nextInt();
        boolean lower = true;
        if (islower != 1)
        {
            lower = false;
        }

        //ends here

        //For Lower Case:
        System.out.println("Press 1 to include NUMBERS in the password, else press 0 ");
        int isnumber = sc.nextInt();
        boolean number = true;
        if (isnumber != 1)
        {
            number = false;
        }

        //ends here

        //For Lower Case:
        System.out.println("Press 1 to include SPECIAL characters in the password, else press 0 ");
        int isspecial = sc.nextInt();
        boolean special = true;
        if (isspecial != 1)
        {
            special = false;
        }
        //ends here

        String validCharacter = "";
        if (upper) validCharacter += upper_case;
        if (lower) validCharacter += lower_case;
        if (number) validCharacter += numbers;
        if (special) validCharacter += special_char;
        int n = validCharacter.length();

        StringBuilder pass = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(n);
            pass.append(validCharacter.charAt(index));
        }
        System.out.println(pass);
    }
}
