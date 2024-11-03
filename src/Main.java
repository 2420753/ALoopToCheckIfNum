import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        readNumber();
    }

    // A function that loops until the input is an integer, if not it will keep asking for a number. Otherwise it will print an error!

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
}