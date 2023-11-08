import java.util.*;
public class Income_tax {
    void calc_income_tax(double age, double income){
        
        double tax_percent;
        if (age < 60){ 
            if (income <= 250000){ 
                tax_percent = 0 ; 
            }else if (income >= 250001 && income <= 500000){ 
                tax_percent = 0.1 ;
            }else if (income >= 500001 && income <= 1000000){ 
                tax_percent = 0.2 ;
            }else{ 
                tax_percent = 0.3 ;
            }  
        }else if (age >= 60 && age < 80){ 
            if (income <= 300000){ 
                tax_percent = 0; 
            }else if (income >= 300001 && income <= 500000){ 
                tax_percent = 0.1; 
            }else if (income >= 500001 && income <= 1000000){ 
                tax_percent = 0.2;
            }else{ 
                tax_percent = 0.3 ;
            }  
        }else{ 
            if(income <= 500000){ 
                tax_percent = 0; 
            }else if (income >= 500001 && income <= 1000000){ 
                tax_percent = 0.2;
            }else{ 
                tax_percent = 0.3; 
            }  
        } 
 
        double tax = tax_percent * income;
        System.out.println("Your Tax is "+ tax );
    }

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        double age=sc.nextInt();
        System.out.println("Enter your annual Income");
        double income=sc.nextInt();
        Income_tax obj = new Income_tax();
        obj.calc_income_tax(age,income);
    }
}
