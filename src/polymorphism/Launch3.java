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

    public void play_football(){
        System.out.println("Boy is playing football with a friend");
    }

    public String toString(){
        return "Boy";
    }
}

class Girl extends Human3{
    public void speak(){
        System.out.println("Speaking stylishly as a girl!!");
    }

    public void sleep(){
        System.out.println("Sleeping gently as a virtuous girl");
    }

    public void plait_hair(){
        System.out.println("Gir plaits hair");
    }

    public String toString(){
        return "Girl";
    }
}

class ClassRoom{

    public Human3 hostHuman(Human3 hum){
        hum.sleep();
        hum.speak();
        if(hum instanceof Boy){
            ((Boy)hum).play_football();
        }
        else if(hum instanceof Girl){
            ((Girl) hum).plait_hair();
        }

        return hum;
    }

}
public class Launch3 {

    public static void main(String[] args) {
        ClassRoom cr = new ClassRoom();
        Boy boy = new Boy();
        Girl girl = new Girl();

        cr.hostHuman(boy);
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        cr.hostHuman(girl);
    }

}
