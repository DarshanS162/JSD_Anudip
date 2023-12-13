
//main class
public class AnimalDemo {
    public static void main(String[] args) {


        // Create objects of each class
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Display sounds
        System.out.println("Generic Animal Sound:");
        genericAnimal.makeSound();

        System.out.println("\nDog Sound:");
        dog.makeSound();

        System.out.println("\nCat Sound:");
        cat.makeSound();
     
    }
}
//base class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
//child class
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
//another child class
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
