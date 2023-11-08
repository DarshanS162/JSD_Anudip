import java.util.Scanner;
public class Pat1 {
    public void printPattern(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
}
  
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =sc.nextInt();
        Pat1 obj= new Pat1();
        obj.printPattern(num);
    }
}
