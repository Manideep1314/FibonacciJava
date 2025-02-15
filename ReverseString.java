import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for input once
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Display the output only once
        System.out.println("Reversed string: " + reversed);
    }
}
