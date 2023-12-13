import java.util.Scanner;
public class Palindrome {

    public static void reverse(int n){
        int arm=0;
        int temp=n;
        while(n>0){
           int rem=n%10;    
            arm=(rem*rem*rem)+arm ;
            n=n/10;
          }
          System.out.println(arm);
          if(arm==temp){
            System.out.println(arm+"  is armstrong ");
          }else{
            System.out.println(arm+"  is not armstrong ");
          }
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        reverse(n);
        
    }

}
