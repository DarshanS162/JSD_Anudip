import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pricipal amount-: ");
        double principal=sc.nextDouble();

        System.out.println("Enter time in years-: ");
        double time=sc.nextDouble();

        CalculateSI si=new CalculateSI(principal);
        System.out.println((principal * si.getRateOfIntrest()* time) / 100);
        sc.close();
    }
}

class CalculateSI{
    double p;
    public CalculateSI(double princi){
        this.p=princi;
    }

    public double getRateOfIntrest(){
        double interestRate;
        if (p > 10000) {
            interestRate = 10;
            return interestRate;
        } else if (p >= 5000 && p <= 10000) {
            interestRate = 8;
            return interestRate;
        } else {
            interestRate = 5;
            return interestRate;
        }
        
    
    }

}