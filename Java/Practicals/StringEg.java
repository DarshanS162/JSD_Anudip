public class StringEg {
    
        public static void main(String[] args) {
            //using string literal
            String info = "Java Full Stack"; // new String instance is created under string pool
            String ab = "Java Full Stack" ; //doesnt create new instance
            ab.concat("Course "); // concat() join the string value at the end 
            System.out.println(ab); //print Java Full Stack, coz string is unchangable
            
            //using new keyword
            String s = new String ("Python course"); //new String instance under heap memory
            String s1 = new String("Java Full Stack");  //new String instance under heap memory
            System.out.println(s);
        }
}


