package polymorphism;

class Car {
    public void start_car(){
        System.out.println("Car Ignition turned on to strat car...");
    }
    public void drive(){
        System.out.println("Car driving...");
    }
}

class GLE extends Car{
    public void make_noise(){
        System.out.println("Gle Mercedez Benz makes noise");
    }
}

public class Launch2 {
    public static void main(String[] args) {
        GLE mercedezGle = new GLE();
        mercedezGle.make_noise();
        mercedezGle.drive();
    }
}
