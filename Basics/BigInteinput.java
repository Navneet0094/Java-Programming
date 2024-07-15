import java.math.BigInteger;
import java.util.Scanner;

public class BigInteinput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a large integer:");
        String input = scanner.nextLine();

        // Convert the input string to a BigInteger
        BigInteger bigInt = new BigInteger(input);

        // Perform some operations
        BigInteger doubled = bigInt.multiply(BigInteger.valueOf(2));
        
        // Print the BigInteger and the result of the operation
        System.out.println("You entered: " + bigInt);
        System.out.println("Doubled value: " + doubled);

        scanner.close();
    }
}
