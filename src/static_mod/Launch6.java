package static_mod;

class Human4 {
    protected static int x;

    static
    {
        System.out.println("This is the second thing to update");
    }

    public Human4(){
        System.out.println("This is the constructor running...");
    }

    {
        System.out.println("Initilzation block for when Object is Instantiated");
    }
}

public class Launch6 {

    static {
        System.out.println("Now IN LAUNCH6...");
    }

    public static void main(String[] args) {
        Human4 human4 = new Human4();
        System.out.println(human4);

        int x = Human4.x;
        System.out.println(x);
    }
}
