import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = sc.nextLine();
        System.out.println("You Entered: " + userInput);

        if (!StringUtils.isNumeric(userInput)) { // Checks if the CharSequence contains only Unicode digits. A decimal point is not a Unicode digit and returns false.
            System.out.println(userInput + " isn't a number");
        } else {
            System.out.println(userInput + " is a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput)); // Swaps the case of a String changing upper and title case to lower case, and lower case to upper case.
        System.out.println("Reversed: " + StringUtils.reverse(userInput)); // Reverses a String as per StringBuilder.reverse().
    }
}
