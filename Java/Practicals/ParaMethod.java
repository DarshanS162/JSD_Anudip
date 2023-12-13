import java.util.Scanner;
public class ParaMethod {
    int cal_Factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        ParaMethod obj= new ParaMethod();
        int res=obj.cal_Factorial(num);
        System.out.println("Factorial of "+num+" is "+res);

        }
}
