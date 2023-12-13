public class Main {
   public static void main(String args[]){
      Person Hari=new Person("prakash",11);
      Person Nikhil = new Person("Rajat",12);
      // Person Hari=new Person();
      // Person Nikhil = new Person();
       System.out.println("Before");
      System.out.println(Hari.getName()+" is "+Hari.getAge()+" years old.");
      // System.out.println(Nikhil.getName()+" is "+Nikhil.getAge()+"  years old.");

      System.out.println("After");
      Hari.setName("pawar");
      Hari.setAge(15);
       System.out.println(Hari.getName()+" is "+Hari.getAge()+" years old.");
        
   } 
}  

class Person{
   private String name1;
   private int age;
   public Person(String name, int age){
      this.name1=name;
      this.age=age;
   }
   
   String getName(){
      return name1;
   }
   int getAge(){
      return age;
   }

   void setName(String name){
      this.name1=name;
   }
   void setAge(int age){
    this.age=age;
   }

}
