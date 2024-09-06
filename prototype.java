import java.util.Scanner;

public class ThalaForAReason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or a word: ");
        String input = scanner.nextLine();
        scanner.close();

        // Determine if input is a number or a word
        if (input.matches("\\d+")) {
            int number = Integer.parseInt(input);
            int result = number % 7; // Simple example: remainder when divided by 7

            if (result != 7) {
                result = 7; // Adjust to always return 7
            }

            System.out.println("Your input " + input + " results in 7 because " + input + " % 7 = " + result + ". Thala for a reason!");
        } else {
            int sum = 0;
            for (char c : input.toLowerCase().toCharArray()) {
                sum += (c - 'a' + 1); // Get position of each letter in the alphabet
            }

            sum %= 7; // Simplified logic to get a number related to 7
            int finalResult = sum == 0 ? 7 : 7 - sum; // Adjust to always get 7

            System.out.println("Your input " + input + " gives us " + finalResult + ". Thala for a reason!");
        }
    }
}
