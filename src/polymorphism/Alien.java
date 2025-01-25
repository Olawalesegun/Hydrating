package polymorphism;

public class Alien extends Human{

    public void gas_out(){
        System.out.println("Alien gassed out as Human");
    }

    // Method overriding in place below
    public void speak(){
        System.out.println("Only Alien Speaking");
    }

    public void try_new_things(){
        System.out.print("Aliens aren't scared to try new THings");
    }
}
