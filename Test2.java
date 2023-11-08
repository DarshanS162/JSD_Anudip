import java.util.Scanner;

public class Test2 {
    public void calcTable(int number) {
        String status;
        Scanner sc = new Scanner(System.in);

        do {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value is: " + (number * i));
            }

            System.out.print("Do you want to continue (y/n)? ");
            status= sc.next(); 
        } while (status.equals("y"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = sc.nextInt();

        Test2 e = new Test2();
        e.calcTable(number);
    }
}


