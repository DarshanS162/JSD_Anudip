import java.util.Scanner;

public class KidLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            displayOptions();
            System.out.print("Enter your choice (1-5): ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter two numbers to be added:");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    System.out.println("Enter two numbers to be subtracted:");
                    int minuend = sc.nextInt();
                    int subtrahend = sc.nextInt();
                    int difference = minuend - subtrahend;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    System.out.println("Enter two numbers to be multiplied:");
                    int factor1 = sc.nextInt();
                    int factor2 = sc.nextInt();
                    int product = factor1 * factor2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    System.out.println("Enter a number to check even or odd:");
                    int number = sc.nextInt();
                    if (number % 2 == 0) {
                        System.out.println("Result: Even");
                    } else {
                        System.out.println("Result: Odd");
                    }
                    break;
                case 5:
                    System.out.println("plzzz enter 1 to 4");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-5).");
            }

        } while (option != 5);

       
    }

    public static void displayOptions() {
        System.out.println("Options:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Check if a number is even or odd");
        System.out.println("5. Exit the program");
    }
}

