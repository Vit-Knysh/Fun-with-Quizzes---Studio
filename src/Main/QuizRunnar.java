package Main;

public class QuizRunnar {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiseQuestion myMultipleChoiseQuestion = new MultipleChoiseQuestion("What sound does the dog make? \nA: Bark \nB: Quak", "A");
        myQuiz.addQuestion(myMultipleChoiseQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all that apply, which animals can fly? \nA: Penguins \nB: Doves \nC: Owls", "B,C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are omnivores? \nTrue or False?","True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();

    }
}
