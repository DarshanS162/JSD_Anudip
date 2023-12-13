package in.anudip.java_prac;
//main class
public class InheritanceEg1 {
	//entry point
		public static void main(String args[]){
			Carnivorous c = new Carnivorous();
			System.out.println("----------Carnivorous animal Lion----------")
;			c.name="lion";
			c.color="yellow-gold";
			c.food="meat";
			c.natureOfLiving=" They are apex predators";
			c.noOfLegs=4;
			c.strength="extremely agile and can change direction quickly when chasing prey.";
			c.Hunting=" they hunt frequently.";
			c.display();
			System.out.println("\n----------Herbivores animal Elephant----------");
			Herbivores h = new Herbivores();
			h.name="Elephant";
			h.color="Grey";
			h.food="Banana & Grass";
			h.natureOfLiving=" Mostly they lying in the mud";
			h.noOfLegs=4;
			h.grazing=" graze between 15 – 20 hours per day";
			h.hunt="They never hunt";
			h.display();
		}
	
}

class Animal {
	
	//parent property
	String name ;
	String color;
	String food;
	String natureOfLiving;
	int noOfLegs;
	
}
//first child class
class Carnivorous extends Animal{
	//child property 
	String strength;
	String Hunting; 
	
	void display(){
		System.out.println(name + "\n" + color + " \n"+ food +"\n"+natureOfLiving +"\n"+ noOfLegs); //parent property
		System.out.println(strength + "\n"+ Hunting); //child property
	}
	
}
//second child class
class Herbivores extends Animal {
	//child property
	String grazing;
	String hunt;
	
	
	void display(){
		System.out.println(name + "\n" + color + "\n"+ food +"\n"+ natureOfLiving +"\n"+ noOfLegs); //parent property
		System.out.println(grazing + "\n"+ hunt); //child property
	}
}


