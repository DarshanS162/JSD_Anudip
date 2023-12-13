//Main class having main method
class Main3 extends Glass{
    public static void main(String args[]) {
        // Making Object of coffee
        Glass coffee1 = new Glass();
        System.out.println("Steps to make coffee:");
        coffee1.twater();
        coffee1.ice();
        coffee1.sugar();
        coffee1.coffee();
        System.out.println("here is your coffee. Enjoy it!!");
    }
}


// class water 
class WaterTank {
    void twater() {
        System.out.println("Add water");
    }

    
}

//class Botttle inheriting watertank

class Bottle extends WaterTank {
    void ice() {
        System.out.println("Add ice");
    }

    void sugar() {
        System.out.println("Add sugar");
    }
}

//class Glass inheriting Bottle
class Glass extends Bottle {
    void coffee() {
        System.out.println("Add coffee");
    }
}

