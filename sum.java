import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            numbers[i] = scanner.nextInt();
        }

        
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        
        System.out.println("The sum of the integers is: " + total);

        
        scanner.close();
    }
}
