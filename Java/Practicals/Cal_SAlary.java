import java.util.Scanner;

class Cal_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use a loop to continue taking input until -1 is entered
        while (true) {
            System.out.print("Enter basic salary (or -1 to exit): ");
            int bsal = sc.nextInt();

            // Check if -1 is entered to exit the loop
            if (bsal == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            myclass2 obj = new myclass2(bsal);
            double grossSalary = obj.cal_gsal();
            System.out.println("Gross Salary: " + grossSalary);
        }

        sc.close();
    }
}

class myclass2 {
    int bsal;

    myclass2(int bsal) {
        this.bsal = bsal;
    }

    public double cal_gsal() {
        double hra, da;

        if (bsal > 15000) {
            hra = 0.2 * bsal;
            da = 0.6 * bsal;
        } else {
            hra = 3000;
            da = 0.7 * bsal;
        }
        return bsal + hra + da;
    }
}
