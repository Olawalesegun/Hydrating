package static_mod;

class Building {
    public void mould_blocks(){
        System.out.println("Blocks are been moulded 1 by 1");
    }
}
final class Land{
    
}
final class Home extends Building{
    public static void trial(){
        System.out.println("Trying final ");
    }
}
public class Launch7 {

    // Rules of Final:
    // 1. Cannot Inherit a final class
    // 2. A final class can inherit
    public static void main(String[] args) {

    }
}
