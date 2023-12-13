 import java.util.Scanner;
public class Armstrong {
   

    int cal_Armstrong(int og_num){
        int rem=0,res=0;
        while (og_num!= 0) {
            // remainder contains the last digit
            rem = og_num % 10;
            res += rem * rem * rem;
            og_num=og_num /= 10;
         }
         return res;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Armstrong obj= new Armstrong ();
        int temp=num;
        int res=obj.cal_Armstrong(num);
        sc.close();
        if (temp==res){
            System.out.println(num+" is Armstrong");
        }
        else{
            System.out.println(num+" is not Armstrong");
        }

        }
}

