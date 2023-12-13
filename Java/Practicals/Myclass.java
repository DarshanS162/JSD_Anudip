
public class Myclass {
    public static void main(String args[]){
       
        Rectangle obj1= new Rectangle(10,20);
        Rectangle obj2= new Rectangle(5,6);
        int area1 = obj1.calculateArea();
        int area2 = obj2.calculateArea();
        if(area1>area2){
            System.out.println("Area1 is greater than area2");
        }else if(area2>area2){
            System.out.println("Area2 is greater than area2");
        }
        else{
            System.out.println("both are equal");
        }
    }
}

class Rectangle{
    int length;
    int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}


