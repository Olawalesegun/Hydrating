package polymorphism;

public class Launch {
    public static void main(String[] args){
        //When I create a reference to the alien object in this manner
        // I won't be able to see or use other methods in the Alien Class except for
        // the methods it inherited, and I can override methods with same name
        // from the parents class in the sub derived class, but any other method
        // inside the class won't reflect.
        Human alienware = new Alien();
        alienware.speak();
        alienware.walk();
        // alienware.gas_out();


        // The commenst from line 5 to 9 does not apply to this.
        Alien alienware2 = new Alien();
        alienware2.try_new_things();
        alienware2.gas_out();
        alienware2.walk();
        alienware2.speak();

    }
}
