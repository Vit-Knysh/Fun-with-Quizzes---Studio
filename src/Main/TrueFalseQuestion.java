package Main;

public class TrueFalseQuestion extends Question{
//    Variables

    //    Constructor
    public TrueFalseQuestion (String question, String answer) {
        super(question, answer);
    }

    //    Method
    @Override
    public boolean checkAnswer (String answer) {
       if(answer.toLowerCase().equals(this.getTheAnswer().toLowerCase())) {
           return true;
       } else {
           return false;
       }
    }
}
