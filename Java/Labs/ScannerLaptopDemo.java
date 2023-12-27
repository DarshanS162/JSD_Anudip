package in.anudip.java_prac;
import java.util.Scanner;
public class ScannerLaptopDemo {
	
	//displaying choice method 
	public static void displayOptions() {
		 System.out.println("------------------------------");
        System.out.println("Options:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Check if a number is even or odd");
        System.out.println("5. Exit the program");
    }
	// method contain the method
	public static void myMethod(){
	Scanner sc= new Scanner(System.in);
	int choice;
	do {
	displayOptions();
	System.out.println("Enter your choice 1-5");
	choice = sc.nextInt();
	sc.nextLine();             // as be are taking the Integer above , so to consume \n(new line character)
	switch(choice){             // we use this
	case 1 : 
		System.out.println("Enter two numbers to be added");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition is -: "+(a+b));
		break;
	case 2:
		System.out.println("Enter two numbers to be subtracted");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Subtraction is -: "+(x-y));
		break;
	case 3:
		System.out.println("Enter two numbers to be Multiplied");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("Multipliction is -: "+(p*q));
		break;
	case 4:
		System.out.println("Enter number to check odd even");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is even");
		}else {
			System.out.println(n+" is odd");
		}
		break;
	 case 5:
         System.out.println("Terminating .............!");
         break;
     default:
         System.out.println("Please enter a valid option.");
         }
	
	}while(choice!=5 );
	sc.close();
	}
	//main method
	public static void main(String[] args) {
		ScannerLaptopDemo.myMethod();
	}
}
