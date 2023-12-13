import java.util.Scanner;; 
public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
     double multi(int j,int k){
        return j*k;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator c= new Calculator();
        //Example 1 : adding two int variables
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
         System.out.println("Multiplication: "+c.multi(a, b)+"\n") ;
        System.out.println("Example 1: "+c.add(a, b)+"\n") ;  // calling Method having two param

        //Example 2 : adding three int variables
        System.out.println("Enter number 1");
        int x=sc.nextInt();
        System.out.println("Enter number 2");
        int y=sc.nextInt();
         System.out.println("Enter number 3");
        int z=sc.nextInt();
        System.out.println("Example 2: "+c.add(x,y,z)+"\n");   // calling Method having three param

        
        //Example 3 : adding two double variables
        System.out.println("Enter number 1");
        double p=sc.nextDouble();
        System.out.println("Enter number 2");
        double q=sc.nextDouble();
        System.out.println("Example 3: "+c.add(p, q)+"\n") ;   // calling Method having two param

        sc.close();
    }
}
