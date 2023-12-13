import java.util.Scanner;
//Main class Car
public class Car {
    String make;
    String model;
    short year;
    int price;

    //car constructor
    Car(String make,String model,short year,int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    //method for displying details
    public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    //main method
    public static void main(String[] args) {
        // Scanner to take values from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car Details");
        System.out.println("Enter the making");
        String make = sc.nextLine();
        System.out.println("Enter the Model");
        String model=sc.nextLine();
        System.out.println("Enter Year");
        Short year=sc.nextShort();
        System.out.println("Enter Price");
        int price=sc.nextInt();

        //creating objects
        System.out.println("-------Details of"+model+"-------");
        Car marutiSuzuki=new Car(make,model,year,price);
        marutiSuzuki.displayCarDetails();
        sc.close();
    }

}
