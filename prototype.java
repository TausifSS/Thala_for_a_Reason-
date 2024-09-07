import java.util.Scanner;

public class ThalaForAReason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        scanner.close();

        String reason = "";
        if (input.matches("\\d+")) {
            int number = Integer.parseInt(input);

            // For specific case like 18 -> 7 (8 - 1 = 7)
            int firstDigit = Character.getNumericValue(input.charAt(0));
            int secondDigit = Character.getNumericValue(input.charAt(1));

            if (firstDigit - secondDigit == 7 || secondDigit - firstDigit == 7) {
                reason = "because subtracting the digits (" + Math.max(firstDigit, secondDigit)
                        + " - " + Math.min(firstDigit, secondDigit) + ") gives 7. Thala for a reason!";
            } else {
                int remainder = number % 7;
                int result;

                if (remainder == 0) {
                    result = 7;
                    reason = "because the remainder is 0, and Dhoni's number is 7!";
                } else if (remainder == 6) {
                    result = remainder + 1;
                    reason = "because we added 1 to make it 7. Thala is always one step ahead!";
                } else if (remainder == 5) {
                    result = remainder + 2;
                    reason = "because we added 2, making it 7, just like Thala’s famous 45 as an opener!";
                } else {
                    result = remainder + (7 - remainder);
                    reason = "because we adjusted it to 7 by adding " + (7 - remainder) + ".";
                }
            }

            System.out.println("Your input " + input + " results in 7 " + reason + " Thala for a reason!");
        } else {
            System.out.println("Please enter a valid number.");
        }
    }
}
