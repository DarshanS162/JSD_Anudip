import java.util.Scanner;
public class Test{
   
   
      
       public void calculate(int num) {
           for (int i = 1; i <= 10; i++) {
               System.out.println(num + "x" + i + "=" + (num * i));
           }
       }
   
       public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           int num;
           char choice;
   
           do {
               System.out.println("Enter the number for which you want the table: ");
               num = sc.nextInt();
               Test obj1 = new Test();
               obj1.calculate(num);
   
               System.out.println("Do you want to calculate another table? (y/n): ");
               choice = sc.next().charAt(0);
           } while (choice == 'y' || choice == 'Y');
   
           sc.close();
       }
   }
   
    