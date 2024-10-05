import java.util.Scanner;
public class CommandLineInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the command line
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter your name: ");
        
        // Read input from the user
        String name = scanner.nextLine();
        
        // Print the input
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
