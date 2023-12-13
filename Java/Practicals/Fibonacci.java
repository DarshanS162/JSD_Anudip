import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc= new Scanner(System.in);
        char ch;
        String temp,rev=" ",s;
        s=sc.nextLine();
        temp=s;
        for(int i=0;i<s.length();i++){
          ch=s.charAt(i);
          
          rev=rev+ch;
          System.out.println(rev);
        }
        System.out.println("original"+temp);
        System.out.println("reverse"+rev);
        }
}
