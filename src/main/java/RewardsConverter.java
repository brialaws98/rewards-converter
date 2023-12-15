
import java.util.Scanner;
// This code converts a cash value into airline miles
public class RewardsConverter {
    public static void main(String[] args) {
        /*
         * Will allow user to enter information.
         * Like a machine that listens to what the user says
         */
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        /*
         * The program is listening to what the user says or types
         * Store the information for later use
         */
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
            /*
                * Program doing some calculations to figure out the
                    miles the number is worth
            */
        var RewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + RewardsValue.getMilesValue() + " miles");
    }
}