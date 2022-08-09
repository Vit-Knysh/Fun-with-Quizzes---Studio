package Main;

public abstract class Question {
//    class Variables

    private final String theQuestion;

    private final String theAnswer;
//    Constructors
    public Question (String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }
//    Methods
//    Getters

    public abstract boolean checkAnswer (String answer);

    public String getTheQuestion() {
        return this.theQuestion;
    }

    public String getTheAnswer() {
        return this.theAnswer;
    }

}
