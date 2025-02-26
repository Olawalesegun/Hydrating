package exceptionalHandling;

public class LaunchExcep2 {

    public static void main(String[] args) {
        try{
            Excep exc = new Excep();
            exc.throw_it();
        } catch(Exception e){
            System.out.println("Work:: " + e.getMessage());
            System.out.println("Finally at hand!!");

        }
    }
}
