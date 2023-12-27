import java.util.Scanner;
public class CompareArea {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking input for rectangle 1
        System.out.println("Enter the length for to calculate Area 1-: ");
        int length1=sc.nextInt();
        System.out.println("Enter the width for to calculate Area 1-: ");
        int width1=sc.nextInt();
        Rectangle area1=new Rectangle(length1, width1);
        System.out.println("Area of 1st rectangle-: "+(area1.calculatearea())+"\n");
      
        //taking input for rectangle 2
        System.out.println("Enter the length for to calculate Area 2-: ");
        int length2=sc.nextInt();
        System.out.println("Enter the width for to calculate Area 2-: ");
        int width2=sc.nextInt();
        Rectangle area2=new Rectangle(length2, width2);
        System.out.println("Area of 1st rectangle-: "+area2.calculatearea()+"\n");

        if(area1.calculatearea()>area2.calculatearea()){
            System.out.println("Rectangle1 > Rectangle2");
        }else if(area1.calculatearea()<area2.calculatearea()){
             System.out.println("Rectangle1 < Rectangle2");
        }else{
             System.out.println("They are equal");
        }
        sc.close();
    }
}

class Rectangle{
    int length;
    int width;
    
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int  calculatearea(){
        int area=length*width;
        return area;
    }
}
