package quizConsole;

public class Student {
    private String studentName;
    private int studentGrade;
    private Question[] ques;
    private String[] answers;
    private int studentId;

    {
        studentId++;
    }

    public Student(){
        this.answers = new String[5];
        this.ques = new Question[5];
    }

    public void setStudentGrade(int _grade){
        this.studentGrade += _grade;
    }

    public int getStudentGrade(){
        return this.studentGrade;
    }

    public void setStudentName(String _studentName){
        this.studentName = _studentName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String answerQuestion(int quesId, String quesAnswer){
//        ques[quesId - 1].setCorrectAnswer(quesAnswer);
        answers[quesId - 1] = quesAnswer;
        return quesAnswer;
    };

    public String getAnswer(int answerId){
        return this.answers[answerId - 1];
    }

    public void getAllAnswers(){
//        for (String ans: answers){
//            System.out.println("Ques");
//        }

        for(int counter = 0; counter < answers.length; counter++){
            System.out.println("Student " + getStudentName() + " answer for Question " + (counter + 1) + "is: " + answers[counter]);
        }
    }
}
