package lambda;

interface Student {
    void learn();
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
    }
}
