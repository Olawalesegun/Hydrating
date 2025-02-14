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
class TestingMethodHiding {
    public void test4(){
        System.out.println("Test 4 in place for Method Hiding");
    }

    static void test7(){
        System.out.println("Test 7 i place for Method Hiding");
    }
}

//NOTE:
//  1. Interface would not inherit or extend an abstract class but
//  2. Interface would extend from another interface
//  3. An abstract class would inherit an interface
//  4. private methods are not accessible in subclass(i.e Inherited class).
//  4. protected methods and public methods are accessible in subclass.

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

public class LaunchInt extends TestingMethodHiding{
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.clear_grass();
        farm.test2();
        test7();
        TestingMethodHiding.test7();
    }
    public void lun(){
        test4();
    }

   // Method Hiding takes place in here
    public static void test7(){
        System.out.println("Method hiding or shadowing took place here");
    }
}
