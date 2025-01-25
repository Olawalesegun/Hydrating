package inheritance;

public class Launch {

    public static void main(String[] args){
        IPhone iphone7 = new IPhone();   // HAS--A  Composition
        iphone7.call();
        iphone7.browse_phone();
        iphone7.end_call();

        Phone iphone14 = new IPhone();
        iphone14.call();
        iphone14.end_call();
    }
}
