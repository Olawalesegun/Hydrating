package polymorphism;

class Vehicle{
    public void move_gear(){
        System.out.println("Vehicle Gear is moved");
    }

    public void change_gear_box(){
        System.out.println("Vehicle gear is being changed");
    }

    public void drive(){
        System.out.println("Vehicle is been driven...");
    }
}

class Trailer extends Vehicle{
    public Trailer(){
        this("Bardock");
        System.out.println("Trailer is a Vehicle, and it's been executed");
    }

    public Trailer(String trailerName){
        super();
        System.out.println(trailerName + " fully activated");
    }
    public void move(){
        super.drive();
    }

    @Override
    public void move_gear(){
        System.out.println("Trailer Gear is moved");
    }
    @Override
    public void change_gear_box(){
        System.out.println("Trailer Gears are being changed.");
    }
    @Override
    public String toString(){
        return "Trailer";
    }
}

public class Launch4 {
    public static void main(String[] args) {
        Trailer trail = new Trailer();
        System.out.println(trail);
    }
}
