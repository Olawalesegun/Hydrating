package polymorphism;

class Human3{
    public void speak(){
        System.out.println("Human now speaks..." +
                "");
    }
    public void sleep(){

        System.out.println("Human is now sleeping..");
    }
}

class Boy extends Human3{
    @Override
    public void speak(){
        System.out.println("Boy speaks as a Boy...");
    }

    @Override
    public void sleep(){
        System.out.println("Boy sleeps gently on the Floor");
    }
}

class ClassRoom{

    public Human3 hostHuman(Human3 hum){
        hum.sleep();
        hum.speak();
        return hum;
    }

}
public class Launch3 {

    public static void main(String[] args) {

    }

}
