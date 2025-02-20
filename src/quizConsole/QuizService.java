package quizConsole;

import java.util.Scanner;

public class QuizService {

    Question[] ques;
    Student[] stud;
    private int questionCount;
    private int studentCount;

    public QuizService(){
        ques = new Question[5];
        stud = new Student[2];
    }
    public void setQues(Question _ques){
        if(questionCount < ques.length){
            ques[questionCount] = _ques;
            questionCount++;
        }
    }

    public void setStudent(Student _stud){
        if(studentCount < this.stud.length){
            stud[studentCount] = _stud;
            studentCount++;
        }
    }

    public void displayAllQuestion(){
        for(Question q: ques){
            System.out.println(q);
        }
    }
    public void playQuiz(){
        Question ques1 = new Question("What is 1 spellt as?", "Onne", "One", "Oenne", "Oene", "One");
        Question ques2 = new Question("Spell Number 2", "Two", "Twoo", "Too", "Toe", "Two");
        Question ques3 = new Question("Who is the President of Nigeria", "Danbaba Dangote", "Ahmed Bola Tinubu", "Barak Obama", "Hosni Mubaraq", "Ahmed Bola Tinubu");
        Question ques4 = new Question("What is the Yoruba name for rice?", "Iresi", "ewa", "moin-moin", "Egbo", "Iresi");
        Question ques5 = new Question("What year are we in?", "2020", "2021", "2025", "2022", "2025");

        Student stud1 = new Student();
        Student stud2 = new Student();

        Scanner scan = new Scanner(System.in);

        setQues(ques1);
        setQues(ques2);
        setQues(ques3);
        setQues(ques4);
        setQues(ques5);

        System.out.println("==================================");

        System.out.println("Hi Student, Kindly enter your Full Name");
        String input = scan.nextLine().trim();
        stud1.setStudentName(input);
        System.out.println("Kindly answer the quiz questions: ");
        displayAllQuestion();
//        ques1.displayQuestion();
        System.out.println("==================================");
//        input = scan.nextLine().trim();
//        stud1.answerQuestion(1, input);
//        int score = gradeStudent(input, 1);
//        stud1.setStudentGrade(score);
        enterAnswerToGetGrade(stud1, 1);
        enterAnswerToGetGrade(stud1, 2);
        enterAnswerToGetGrade(stud1, 3);
        enterAnswerToGetGrade(stud1, 4);
        enterAnswerToGetGrade(stud1, 5);

//        input = scan.nextLine().trim();
//        stud1.answerQuestion(3, input);
//        score = gradeStudent(input, 3);
//        stud1.setStudentGrade(score);

//        input = scan.nextLine().trim();
//        stud1.answerQuestion(4, input);
//        score = gradeStudent(input, 4);
//        stud1.setStudentGrade(score);

//        input = scan.nextLine().trim();
//        stud1.answerQuestion(5, input);
//        score = gradeStudent(input, 5);
//        stud1.setStudentGrade(score);

        System.out.println("Student with the Name: " + stud1.getStudentName() + " grade is: " + stud1.getStudentGrade() );


        System.out.println("Kindly enter your name for the second student");
        String input2 = scan.nextLine().trim();
        stud2.setStudentName(input2);
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

    public void enterAnswerToGetGrade(Student stud, int _quesNum){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        stud.answerQuestion(_quesNum, input);
        int score = gradeStudent(input, _quesNum);
        stud.setStudentGrade(score);
    }

    public int gradeStudent(String _studAnswer, int _num){
        String res2 = ques[_num - 1].getCorrectAnswer();
        System.out.println(ques[_num - 1].getCorrectAnswer());
        if(_studAnswer.equals(res2)){
            return 5;
        }else{
            return -5;
        }
    }

    public boolean confirmAnswer(String res, String answer){
        return res.equals(answer);
    }
}
