package in.anudip.java_prac;
import java.util.Scanner;
public class ExceptionHandlingActivity {
	//main method
	public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligible {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Employee");
		String name=sc.nextLine();
		System.out.println("Employee is indian(true / false) ");
		boolean isIndian=sc.nextBoolean();
		System.out.println("Enter salry of Employee");
		double salary=sc.nextDouble();
		TaxCalculator emp1= new TaxCalculator();
		emp1.calculateTax(name, isIndian, salary);
		sc.close();
	}

}

// class  TaxCalculator having method for calculating tax
class TaxCalculator{
	public void calculateTax(String eName,boolean isIndian,double eSalary) throws CountryNotValidException, EmployeeNameInvalidException,TaxNotEligible {
		double tax_amt;
		if(isIndian==false) {
			throw new CountryNotValidException("the employee should be a indian citizen for calculating tax ");
		}
		if(eName==null || eName.isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if(eSalary>1000000 && isIndian==true) {
			tax_amt=eSalary*8/100;
		}else if(eSalary<1000000 && eSalary>=50000 && isIndian==true) {
			tax_amt=eSalary*6/100;
		}else if(eSalary<50000 && eSalary>=30000 && isIndian==true) {
			tax_amt=eSalary*5/100;	
		}else if(eSalary<30000 && eSalary>=10000 && isIndian==true) {
			tax_amt=eSalary*4/100;	
		}else {
			throw new TaxNotEligible("The employee does not need to pay tax");
		}
		System.out.println("Tax amount is "+tax_amt);
	}
}


// custom exception CountryNotValidException
class CountryNotValidException extends Exception{
	public CountryNotValidException(String msg) {
		super(msg);
	}
}

//custom exception EmployeeNameInvalidException
class  EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String msg) {
		super(msg);
	}
}

//custom exception TaxNotEligible
class TaxNotEligible extends Exception{
	public TaxNotEligible(String msg) {
		super(msg);
	}
}
