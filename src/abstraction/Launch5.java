package abstraction;

abstract class Flight {
    int n = 0;
    abstract public void fly_craft();
    abstract public void repair_craft();
    public int stack_flights(){
        n += 1;
        System.out.println("Number of flights stacked is: " + n);
        return n;
    }
}

class CargoPlane extends Flight{
    public void carry_goods(){
        System.out.println("CargoPlane carries goods..");
    }
    public void drop_goods(){
        System.out.println("CargoPlane drops goods");
    }
    public void pick_cargo_slot() {
        System.out.println("Cargo slot picked");
    }
    @Override
    public void fly_craft(){
        System.out.println("Cargo Plane now flying....");
    }
    @Override
    public void repair_craft() {
        System.out.println("Flight now under maintenance...");
    }

}

class Crane extends Flight{
    public void carry_goods(){
        System.out.println("Crane carries goods..");
    }
    public void drop_goods(){
        System.out.println("Crane drops goods");
    }
    public void pick_cargo_slot() {
        System.out.println("Crane slot picked");
    }
    public void fly_craft(){
        System.out.println("Crane Plane now flying....");
    }
    public void repair_craft() {
        System.out.println("Flight now under maintenance...");
    }

}

public class Launch5 {
    public static void main(String[] args) {
        CargoPlane cargo = new CargoPlane();
        Crane crane = new Crane();
        System.out.println(cargo.stack_flights());

        compute(cargo);
        compute(crane);
    }

    private static void compute(Flight ref){
        ref.fly_craft();

        if(ref instanceof CargoPlane){
            ((CargoPlane) ref).carry_goods();
            ((CargoPlane) ref).pick_cargo_slot();
            ((CargoPlane) ref).drop_goods();
        }
        else if(ref instanceof Crane){
            ((Crane) ref).carry_goods();
            ((Crane) ref).pick_cargo_slot();
            ((Crane) ref).drop_goods();
        }
        ref.repair_craft();
        System.out.println(ref.stack_flights());
    }
}