package interrface;

abstract class Earth extends TestToSee{
    abstract void exists();
}
class TestToSee{
    void test2(){
        System.out.println("Testing To See different Reactions");
    };
}

interface  Test3{
    void test3();
}

//NOTE:
//  1. Interface would not inherit or extend an abstract class but
//  2. Interface would extend from another interface
//  3. An abstract class would inherit an interface

interface Land extends Test3 {
    void clear_grass();
    void farm_crop();
    void exists();
    default void testing_things_out(){
        System.out.println("Note that this is strongly frown against");
    }

}

class Farm extends TestToSee implements Land {
    public void clear_grass() {
        System.out.println("Clearing Grass for farming");
    }

    public void farm_crop(){
        System.out.println("Grass has been cleared and I can now farm crop");
    }

    public void exists(){

    }
    public void test3(){
        System.out.println("Testing to see how interface works");
    }
}

public class LaunchInt {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.clear_grass();
    }
}
