package exceptionalHandling;

public class Launch3 {

    public static void fl(){
        try{
            Prac prc = new Prac();
            prc.printt();
        } catch(Exception e){
            System.out.println("InputException:: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Launch3.fl();
    }
}
