
class WaterTank {
    void twater() {
        System.out.println("Add water");
    }

    public static void main(String args[]) {
        Glass coffee1 = new Glass();
        System.out.println("Steps to make coffee:");
        coffee1.twater();
        coffee1.ice();
        coffee1.sugar();
        coffee1.coffee();
        System.out.println("coffee here is your coffee. Enjoy it!!");
    }
}

class Bottle extends WaterTank {
    void ice() {
        System.out.println("Add ice");
    }

    void sugar() {
        System.out.println("Add sugar");
    }
}

class Glass extends Bottle {
    void coffee() {
        System.out.println("Add coffee");
    }
}