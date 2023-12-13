public class Main2 {
   public static void main(String args[]){
        Circle obj=new Circle(2.4);
        obj.area();
        obj.circum();

        obj.setRadius(0);
           obj.area();
        obj.circum();


        
   } 
}

class Circle{
    double radius;

    Circle(double rad){
       this.radius=rad;
    }
    void setRadius(double rad){
        this.radius=rad;
    }

    void area(){
      double area= 2.14*radius*radius;
      System.out.println("area of circle is "+area);
    }
    void circum(){
      double c= 2*2.14*radius;
      System.out.println("circumference of circle is "+c);
    }
}
