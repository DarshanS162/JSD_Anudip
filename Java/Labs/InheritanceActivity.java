package in.anudip.java_prac;

public class InheritanceActivity {

	// main method
		public static void main(String[] args) {

			// creating object of Manager class
			Manager m= new Manager(126534,"Peter","Chennai India",237844,65000);
			double total_salm=m.calculateSalary()+m.calculateTransportAllowance();
			System.out.println("Peter having  Salary--: "+total_salm);
			System.out.println("Transport Allowance for Peter is --: "+m.calculateTransportAllowance());

			//creating object of Trainee class
			Trainee t= new Trainee(29846,"Jack","Mumbai India",442085,45000);
			double total_salt=t.calculateSalary()+t.calculateTransportAllowance();
			System.out.println("Jack having Salary--: "+total_salt);
			System.out.println("Transport Allowance for Peter is --: "+t.calculateTransportAllowance());
			
		}	

	}


class Emplyoee {
	long empId;
	String empName;
	String empAddress;
	long empPhone;
	double basicSal;
	double specialAllow=250.80;
	double hra=1000.50;
	
	//default Constructor
	public Emplyoee() {        
		
	}
	
	//Overloaded constructor
	public Emplyoee(long empId,	String empName,String empAddress,long empPhone) { 
		this.empId=empId;
		this.empName=empName;
		this.empAddress=empAddress;
		this.empPhone=empPhone;
	}
	
	// method to calculate salary
	public double calculateSalary() {
		double salary =  basicSal + ( basicSal * specialAllow/100) + ( basicSal * hra/100); 
		return salary;
	}
	
	// calculateTransportAllowance method
	public double calculateTransportAllowance () {
		double transportAllowance = 10*basicSal/100;
		return transportAllowance;
	}
}

// manager class (child 1)
class Manager extends Emplyoee{
	//default Constructor
	public Manager(){
		
	}
	
	//Overloaded constructor
	public Manager(long Id,	String Name,String Address,long Phone,double salary) { 
		this.empId=Id;
		this.empName=Name;
		this.empAddress=Address;
		this.empPhone=Phone;
		this.basicSal=salary;
	}
	
	public double calculateTransportAllowance () {
		double transportAllowance = 15*basicSal/100;
		return transportAllowance;
	}
}

// Trainee class (child 2)
class Trainee extends Emplyoee{
	
	//default Constructor
		public Trainee(){
			
		}
		
		//Overloaded constructor
		public Trainee(long Id,	String Name,String Address,long Phone,double salary) { 
			this.empId=Id;
			this.empName=Name;
			this.empAddress=Address;
			this.empPhone=Phone;
			this.basicSal=salary;
		}
}


