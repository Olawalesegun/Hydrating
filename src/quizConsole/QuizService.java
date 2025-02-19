package quizConsole;

public class QuizService {

    Question ques;
    Student stud;

    public void PlayQuiz(){
        Question ques1 = new Question("What is 1 spellt as?", "Onne", "One", "Oenne", "Oene", "One");
        Question ques2 = new Question("Spell Number 2", "Two", "Twoo", "Too", "Toe", "Two");


        System.out.println("Before Student Object are created");

        System.out.println("==================================");
        Student stud1 = new Student();
        stud1.setStudentName("Bolaji Thompson");

        Student stud2 = new Student();
        stud2.setStudentName("Babajide Folly");
        System.out.println("==================================");

        ques1.displayQuestion();
        ques2.displayQuestion();

        stud1.answerQuestion(1, "One");
        stud1.answerQuestion(2, "Two");
        boolean status1 = confirmAnswer(stud1.getAnswer(1), ques1.getCorrectAnswer());
        stud1.answerQuestion(2, "Two");
        boolean status2 = confirmAnswer(stud1.getAnswer(2), ques2.getCorrectAnswer());
        System.out.println("This student One is" + status1 + status2);

        stud1.getAllAnswers();
    }

    public boolean confirmAnswer(String res, String answer){
        if(res.equals(answer)){
            return true;
        }else {
            return false;
        }
    }
}
