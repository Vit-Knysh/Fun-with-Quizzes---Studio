package Main;

public class CheckBoxQuestion extends Question {
//    Variables

//    Constructor
    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

//    Method
    @Override
    public boolean checkAnswer (String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
