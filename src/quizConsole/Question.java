package quizConsole;

public class Question {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;

    private int id;

    {
        id = id + 1;
    }

    public Question(String _ques, String _option1, String _option2, String _option3, String _option4, String answer) {
        this.question = _ques;
        this.option1 = _option1;
        this.option2 = _option2;
        this.option3 = _option3;
        this.option4 = _option4;
        this.correctAnswer = answer;
    }

    public String getCorrectAnswer(){
        return this.correctAnswer;
    };

    public String displayQuestion(){
        return "Question" + id + ": " +
                this.question + " " +
                this.option1 + " " +
                this.option2 + " " +
                this.option3 + " " +
                this.option4 + " " ;
    }

    public void setCorrectAnswer(String _correctAnswer){
        this.correctAnswer = _correctAnswer;
    }

    public String toString(){
        return "Question" + id + ": " +
                this.question + " " +
                this.option1 + " " +
                this.option2 + " " +
                this.option3 + " " +
                this.option4 + " " ;
    }
}
