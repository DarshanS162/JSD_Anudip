import java.util.ArrayList;
import java.util.Scanner;;
public class GradeCalculator {

    public static void main(String[] args) {
        GradeCalDarshan student1=new GradeCalDarshan();
        student1.gradeCal();
    }


}

class GradeCalDarshan{
    public void gradeCal(){
        int sum=0,avg=0;
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<Integer>();
        //taking input from user and adding it into ArrayList
        for(int i=1;i<=5;i++){
            System.out.println("Enter marks of subject "+i+" ");
            int m= sc.nextInt();
            marks.add(m);
        }
        //calculating sum of marks
        for(int j=0;j<marks.size();j++){
            sum+=marks.get(j);
        }

        //print the marks stored in Arraylist
        for(Integer ele:marks){
            System.out.println(ele);
            }
        //calculating avg of marks
        avg=sum/marks.size();
        System.out.println("Total of marks-:"+sum);
        System.out.println("Average of marks-:"+avg);
        if(avg>90){
            System.out.println(" You got Exellent");
        }else if(avg>80){
            System.out.println(" You got A");
        }else if(avg>60){
            System.out.println(" You got B");
        }else if(avg>=40){
            System.out.println("You got C");
        }else if(avg<40){
            System.out.println("You got F");
        }

        sc.close();
    }
}
