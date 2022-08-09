package Main;

public class MultipleChoiseQuestion extends Question {
//  Variables



//    Constructor
    public MultipleChoiseQuestion(String question, String answer) {
        super(question, answer);
    }

//  Methods

    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getTheAnswer();
        if (answer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }


}
