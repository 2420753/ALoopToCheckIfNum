import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        //readNumber();

        readInteger();

    }

    // A function that loops until the input is an integer, if not it will keep asking for a number. Otherwise it will print an error!
    /*
    static int readNumber() {
        boolean read = true;
        int checkNumber = 0;

        System.out.print("Enter a number: ");


        while (read) {
            try {
                checkNumber = Integer.parseInt(stdin.nextLine());
                read = false;
            } catch (NumberFormatException e) {
                System.out.print("You entered an invalid number! Try again: ");

            }
        }
        return checkNumber;
    };
     */

    // Function exercise 9a - Double method now.
    static int readInteger() {
        boolean read = true;
        int checkNumber = 0;

        System.out.print("Enter a number between 20 and 50 inclusive: ");

        // Checks if number is in the range, if not it will keep asking until it is. It prints well done if the user is in the range.
        while (read) {
            try {
                checkNumber = Integer.parseInt(stdin.nextLine());
                if (checkNumber >= 20 && checkNumber <= 50) {
                    System.out.println("This number is within the range, well done!");
                    read = false;
                } else {
                    System.out.print("This number is invalid, Try again: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("You entered an invalid number! Try again: ");

            }


        }
        return checkNumber;
    }
}