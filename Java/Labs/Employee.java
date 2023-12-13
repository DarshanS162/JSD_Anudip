class Employee{
    //Add member variables: id and age of type int, name of type String and isPermanent of type boolean
    protected int id;
    //protected int age = 35.5;   // Type mismatch error encounters cannot convert from double to int 
    protected double age= 35.5;  // here we change the datatype from int to double
    protected String name;
    protected boolean isPermanent;

    //creating constructor to intialise values
    Employee(int id,double age,String name,boolean isPermanent){
        this.id=id;
        this.age=age;
        this.name=name;
        this.isPermanent=isPermanent;
    }
        // Getter and setter methods
        protected int getId() {
            return id;
        }
        protected void setId(int id) {
        this.id = id;
        }
        protected double getAge() {
            return age;
        }
        protected void setAge(double age){
            this.age=age;
        }
        protected String getName(){
            return name;
        }
        protected void setName(String name){
            this.name=name;
        }
        protected boolean isPermanent() {
            return isPermanent;
        }
    
        protected void setPermanent(boolean permanent) {
            isPermanent = permanent;
        }
    
    
    public static void main(String[] args) {
        Employee emp1= new Employee(1,22,"Darshan",true);
        Employee emp2= new Employee(2,23,"Tejas",false);
        System.out.println("------------Employee1--------------");
        emp1.setName("Rahul");
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getId());
        System.out.println(emp1.isPermanent());
        System.out.println("------------Employee2--------------");
        System.out.println(emp2.getName());
        System.out.println(emp2.getAge());
        System.out.println(emp2.getId());
        System.out.println(emp2.isPermanent());
        System.out.println("Successfully started");
    }

}