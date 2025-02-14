package lambda;

interface Student {
    void learn();
}

interface School{
    void welcome_students();
    void register_students();
}

class MyClass{
    private final int myVar;
    {
        myVar = 10;
        System.out.println(myVar);
    }
}

public class LaunchT {
    public static void main(String[] args) {
        Student student = new Student(){
            public void learn(){
                System.out.println("Student is Learning!11");
            }
        };
        student.learn();
        Student student1 = () -> System.out.println("Student2 is Learning");
        student1.learn();
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = new String(chars,1,3);
        System.out.println(str);
        String st1 = new String(chars);
        String st2 = new String(st1);
        System.out.println(st1);
        System.out.println(st2);

        School sch = new School() {
            @Override
            public void welcome_students() {

            }

            @Override
            public void register_students() {

            }
        };

        MyClass myc = new MyClass();
        System.out.println(myc);
    }
}
