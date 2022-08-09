package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    //    Variables
    ArrayList<Question> questions = new ArrayList<Question>();
    int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

//    Constructor
    public Quiz () {

    }

//    Method
    public void addQuestion (Question question) {
        this.questions.add(question);
    }

    public void runQuiz () {
        for (Question question : questions) {
            System.out.println(question.getTheQuestion());
            String usersAnswer = this.getUsersAnswers();
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);

            if(userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }

        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswers () {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
